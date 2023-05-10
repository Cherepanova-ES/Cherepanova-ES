package task11;

public class Main {
    public static void main(String[] args) {
        String[] vowels = {"а", "о", "у", "ы", "э", "е", "ё", "и", "ю", "я"};
        String word = "Катя";
        for (String vowel : vowels) {
            word = word.replace(vowel, "");
        }
        System.out.println(word);
    }
}