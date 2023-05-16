package task20;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;

        int[][] array = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ring = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                array[i][j] = ring + 1;
            }
        }


        try (FileWriter writer = new FileWriter("array.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
