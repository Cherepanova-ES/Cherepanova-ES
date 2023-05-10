package task8;

import java.util.Arrays;
import static java.lang.Math.acos;
import static java.lang.Math.pow;

public class Triangle {
    private  boolean check;
    private final int [] array;
    public Triangle(int [] array) {
        this.array = array;
        Arrays.sort(array);
    }
    public void IsThereTriangle() {
        if (array[0] + array[1] > array[2]) {
            System.out.println("Из данных отрезков получится составить треугольник");
            check = true;
        } else {
            System.out.println("Из данных отрезков не получится составить треугольник");
            check = false;
        }
    }
    public double findAngle() {
        if (check) {
            return 180 - Math.toDegrees(acos((pow(array[1], 2) + pow(array[2], 2) - pow(array[0], 2)) / (2 * array[1] * array[2])));
        } else {
            return 0;
        }
    }
}