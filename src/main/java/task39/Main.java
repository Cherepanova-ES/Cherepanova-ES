package task39;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int res = getNum(n);
        System.out.println(res);
    }
    public static int getNum(int n) {
        int[] arr = Integer.toString(n).chars().map(c -> c - '0').toArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        int ver = arr[i];
        arr[i] = arr[j];
        arr[j] = ver;
        reverse(arr, i + 1, arr.length - 1);

        int result = 0;
        for (int k = 0; k < arr.length; k++) {
            result = result * 10 + arr[k];
        }
        return result;
    }
    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
