package task1;

import java.util.Arrays;
import java.util.Random;
public class Matrix {
    private final int Size;
    private final int[][] matrix;

    public Matrix(final int Size) {
        this.Size = Size;
        matrix = new int[Size][Size];
        Random randomizer = new Random();
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(9) + 1;
            }
        }
    }
    public void getMatrix(){
        System.out.println(Arrays.deepToString(matrix)
                .replace("[[", "[")
                .replace("], ", "]\n")
                .replace("]]", "]"));
    }
    public String transMatrix(){
        int[][] transMatrix = new int[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return Arrays.deepToString(transMatrix)
                .replace("[[", "[")
                .replace("], ", "]\n")
                .replace("]]", "]");
    }
}
