package task3;

import java.util.Scanner;

public class Coordinates {
    public float [] coordinates() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        float [] coordinate = new float [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите координату точки:");
            coordinate[i] = scanner.nextInt();
        }
        return coordinate;
    }
}