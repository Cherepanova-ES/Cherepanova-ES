package task2;

import java.util.ArrayList;
import java.util.Scanner;
public class Input {
    public ArrayList<Integer> getInfo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> info = new ArrayList<Integer>();
        int i = -1;
        do {
            i++;
            info.add(scanner.nextInt());
        } while ((info.get(i) == 0) || (info.get(i) == 1));
        info.remove(i);
        return info;
    }
}