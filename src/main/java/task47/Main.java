package task47;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> sortedList = zmeya(test);
        System.out.println(sortedList);
    }
    public static List<Integer> zmeya(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++)
                result.add(array[rowStart][i]);
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++)
                result.add(array[i][colEnd]);
            colEnd--;


            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--)
                    result.add(array[rowEnd][i]);
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--)
                    result.add(array[i][colStart]);
                colStart++;
            }
        }

        return result;
    }

}