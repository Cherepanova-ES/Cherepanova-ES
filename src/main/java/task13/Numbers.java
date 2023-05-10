package task13;

public class Numbers {
    private final int Size;
    private final int Step;
    int firstNumber;
    public Numbers(int firstNumber, int Step, int Size) {
        this.Size = Size;
        this.Step = Step;
        this.firstNumber = firstNumber;
    }
    public int [] makeArray() {
        int [] numbers = new int[Size];
        for (int i = 0; i < Size; i++) {
            numbers[i] = firstNumber;
            firstNumber += Step;
        }
        return numbers;
    }
}