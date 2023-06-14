package task44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String first = vvod.nextLine();
        System.out.print("Введите второе число: ");
        String second = vvod.nextLine();
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        int sum = firstNum + secondNum;
        System.out.println("Результат: " + Integer.toString(sum));
    }
}
