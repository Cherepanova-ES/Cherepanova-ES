package task2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        Scan scan = new Scan(info);
        System.out.println("Количество работников = " + scan.counter());
    }
}