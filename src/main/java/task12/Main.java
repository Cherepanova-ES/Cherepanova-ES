package task12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SquareNumbers numbers = new SquareNumbers(7, 3);
        System.out.println(Arrays.toString(numbers.findSquares()));
    }
}
