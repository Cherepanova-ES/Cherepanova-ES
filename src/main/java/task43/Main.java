package task43;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите количество уровней пирамиды: ");
        int n = vvod.nextInt();
        int[][] pir = new int[n][n];
        System.out.println("Введите числа для каждого уровня пирамиды:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                pir[i][j] = vvod.nextInt();
            }
        }
        int maxSum = pir[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    pir[i][j] += pir[i-1][j];
                } else if (j == i) {
                    pir[i][j] += pir[i-1][j-1];
                } else {
                    pir[i][j] += Math.max(pir[i-1][j], pir[i-1][j-1]);
                }
                if (pir[i][j] > maxSum) {
                    maxSum = pir[i][j];
                }
            }
        }
        System.out.println("Максимальная сумма скольжения: " + maxSum);
    }
}
