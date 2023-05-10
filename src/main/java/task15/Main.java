package task15;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String string = "abc abc ab abc ab acs acs";
        String[] arrayString = string.split(" ");
        ArrayList <String> uniqueString = new ArrayList<>();
        uniqueString.add(arrayString[0]);
        for (String word : arrayString) {
            if (!uniqueString.contains(word)) {
                uniqueString.add(word);
            }
        }
        System.out.println(uniqueString);
    }
}
