package task2;

import java.util.ArrayList;
public class Scan {
    private final ArrayList<Integer> info;
    public Scan(ArrayList<Integer> info) {
        this.info = info;
    }
    public int counter(){
        int count = 0;
        for (int i : info) {
            if (i == 1) {
                count++;
            }
        }
        return count;
    }
}