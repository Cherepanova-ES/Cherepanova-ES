package task12;

import static java.lang.Math.pow;

public class SquareNumbers {
    private final int Size;
    private final int Step;
    public SquareNumbers(int Size, int Step) {
        this.Size = Size;
        this.Step = Step;
    }
    public int [] findSquares() {
        int firstNumber = Step;
        int [] numbers = new int[Size];
        for (int i = 0; i < Size; i++) {
            numbers[i] = (int) pow(firstNumber, 2);
            firstNumber += Step;
        }
        return numbers;
    }
}