package task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        System.out.println(info);
        sumSquare square = new sumSquare(info);
        System.out.println("Сумма квадаратов введенных числе = " + square.Sum());
    }
}
