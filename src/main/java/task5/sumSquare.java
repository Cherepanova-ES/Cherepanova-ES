package task5;

import java.util.ArrayList;
import static java.lang.Math.pow;
public class sumSquare {
    private ArrayList<Integer> array;
    public  sumSquare(ArrayList<Integer> array) {
        this.array = array;
    }
    public int Sum() {
        int sum = 0;
        for (int number : array) {
            sum += pow(number, 2);
        }
        return sum;
    }
}
