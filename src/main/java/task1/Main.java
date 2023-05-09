package task1;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.getMatrix();
        System.out.println("Транспонированная матрица:\n" + matrix.transMatrix());
    }
}