package kt5;

import java.io.*;
import java.util.*;

public class Calculate {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = "";
        while (!line.equals("exit")) {
            System.out.print("Введите уравнение: ");
            line = sc.nextLine();
            if (line.equals("История")) {
                printHistory();
                continue;
            }
            String resultStr = "";
            try {
                resultStr = Integer.toString(calculate(line));
            } catch (Exception e) {
                resultStr = "Ошибка: " + e.getMessage();
            }
            System.out.println("Результат: " + resultStr);
            saveInHistory(line + " = " + resultStr);
        }
    }

    private static void printHistory() {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("calc.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения истории: " + e.getMessage());
        }
    }

    private static int calculate(String equation) {
        Stack<Character> opStack = new Stack<>();
        Stack<Integer> valStack = new Stack<>();
        equation = equation.replaceAll("\\s+", "");

        for (int i = 0; i < equation.length(); ++i) {
            char c = equation.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    sb.append(equation.charAt(i++));
                }
                valStack.push(Integer.parseInt(sb.toString()));
                --i;
            } else if (c == '|') {
                i++;
                StringBuilder strB = new StringBuilder();
                while (i < equation.length() && equation.charAt(i) != '|') {
                    strB.append(equation.charAt(i++));
                }
                valStack.push(Math.abs(Integer.parseInt(strB.toString())));
            } else if (c == '^') {
                opStack.push(c);
            } else if (c == '*' || c == '/' || c == '%') {
                while (!opStack.isEmpty() && (opStack.peek() == '*' || opStack.peek() == '/' || opStack.peek() == '%')) {
                    valStack.push(doOperation(opStack.pop(), valStack.pop(), valStack.pop()));
                }
                opStack.push(c);
            } else if (c == '+' || c == '-') {
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    valStack.push(doOperation(opStack.pop(), valStack.pop(), valStack.pop()));
                }
                opStack.push(c);
            } else if (equation.substring(i).startsWith("//")) {
                i++;
                opStack.push('/');
            } else if (c == '(') {
                opStack.push(c);
            } else if (c == ')') {
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    valStack.push(doOperation(opStack.pop(), valStack.pop(), valStack.pop()));
                }
                opStack.pop();
            }
        }

        while (!opStack.isEmpty()) {
            valStack.push(doOperation(opStack.pop(), valStack.pop(), valStack.pop()));
        }

        if (valStack.size() > 1 || opStack.size() > 0) {
            throw new IllegalArgumentException("Неверное уравнение");
        }

        return valStack.pop();
    }

    private static int doOperation(char operator, int operand2, int operand1) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Деление на ноль");
                }
                return operand1 / operand2;
            case '%':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Деление на ноль");
                }
                return operand1 % operand2;
            case '^':
                return (int) Math.pow(operand1, operand2);
        }
        throw new IllegalArgumentException("Unknown operator: " + operator);
    }

    private static void saveInHistory(String message) {
        try (FileWriter fw = new FileWriter(new File("calc.txt"), true)) {
            fw.write(message + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Ошибка сохранения в историю: " + e.getMessage());
        }
    }
}