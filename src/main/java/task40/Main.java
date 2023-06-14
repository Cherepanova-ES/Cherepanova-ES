package task40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите ряд чисел через пробел: ");
        String input = vvod.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(getCh(arr));
    }
    public static String getCh(int[] arr) {
        StringBuilder strb = new StringBuilder();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n - 1 && arr[j] + 1 == arr[j + 1]) {
                j++;
            }
            if (i == j) {
                strb.append(arr[i]);
            } else {
                strb.append(arr[i]).append("-").append(arr[j]);
            }
            if (j < n - 1) {
                strb.append(",");
            }
            i = j + 1;
        }
        return strb.toString();
    }
}
