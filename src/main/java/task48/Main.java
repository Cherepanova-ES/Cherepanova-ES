package task48;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int x = 20;
        int y;
        int z;
        HashSet<Integer> set = new HashSet<>();
        for(int u = 1; set.size() < x; u++) {
            y = 2 * u + 1;
            z = 3 * u + 1;
            set.add(u);
            set.add(y);
            set.add(z);
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
