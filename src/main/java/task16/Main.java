package task16;

public class Main {
    public static void main(String[] args) {
        String word = "abCCaaR";
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.toUpperCase().charAt(i)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        if (upperCount > lowerCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}