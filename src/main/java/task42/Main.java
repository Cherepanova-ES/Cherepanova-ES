package task42;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите количество интервалов: ");
        int n = vvod.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите левую и правую границы интервала " + (i + 1));
            int left = vvod.nextInt();
            int right = vvod.nextInt();
            count += right - left ;
        }
        System.out.println("Количество чисел между заданными интервалами: " + count);
    }
}