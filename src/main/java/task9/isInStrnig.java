package task9;

public class isInStrnig {
    private final String secondString;
    private final String firstString;
    public isInStrnig(String firstString, String secondString) {
        this.secondString = secondString;
        this.firstString = firstString;
    }
    public boolean checkEnd () {
        return firstString.endsWith(secondString);
    }
}
