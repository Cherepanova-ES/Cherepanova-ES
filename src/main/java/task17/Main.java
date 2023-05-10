package task17;

public class Main {
    public static void main(String[] args) {
        checkBrackets brackets = new checkBrackets("())");
        System.out.println(brackets.check());
    }
}