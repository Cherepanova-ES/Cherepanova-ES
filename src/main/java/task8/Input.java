package task8;

import java.util.Scanner;
public class Input {
    public int[] getInfo() {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int [] info = new int[size];
        for (int i = 0; i < size; i++) {
            info[i] = scanner.nextInt();
        }
        return info;
    }
}
