package task4;

public class strCount {
    String text;
    char Char;
    public strCount (String text, char Char) {
        this.text = text;
        this.Char = Char;
    }
    public int str_count() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == Char) {
                count++;
            }
        }
        return count;
    }
}