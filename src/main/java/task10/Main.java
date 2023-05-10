package task10;

public class Main {
    public static void main(String[] args) {
        String word = "кАтЯ";
        String name = "";
        name = word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
        System.out.println("Привет, " + name);
    }
}