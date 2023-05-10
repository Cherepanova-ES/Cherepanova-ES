package task7;

public class findNumber {
    private final int number;
    public findNumber (int number) {
        this.number = number;
    }
    public String find() {
        return String.format("%.0f", Math.sqrt(number));
    }
}
