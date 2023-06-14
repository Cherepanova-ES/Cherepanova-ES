package task46;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите римское число для конвертации: ");
        String rim = vvod.nextLine().toUpperCase();
        int arab = romanToArabic(rim);
        System.out.println("Арабское число: " + arab);
    }
    public static int romanToArabic(String rim) {
        int sum = 0;
        int lastNum = 0;
        String rimNum = rim.toUpperCase();
        for (int i = rimNum.length() - 1; i >= 0; i--) {
            char ch = rimNum.charAt(i);
            int number = letterToNumber(ch);

            if (number < lastNum) {
                sum -= number;
            } else {
                sum += number;
            }
            lastNum = number;
        }

        return sum;
    }
    public static int letterToNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Некорректное римское число: " + letter);
        }
    }
}