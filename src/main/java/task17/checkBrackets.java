package task17;

public class checkBrackets {
    private final String brackets;
    public checkBrackets(String brackets) {
        this.brackets = brackets;
    }
    public boolean check() {
        int leftBracket = 0;
        int rightBracket = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                leftBracket += 1;
            } else if (brackets.charAt(i) == ')') {
                rightBracket += 1;
            }
        }
        return leftBracket == rightBracket;
    }
}
