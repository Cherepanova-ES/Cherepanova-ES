package task45;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int years = vvod.nextInt();
        if (years < 1 || years > 9999) {
            System.out.println("Количество лет должно быть в диапазоне от 1 до 9999");
            return;
        }
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder rimGusi = new StringBuilder();
        rimGusi.append(thousands[years/1000]);
        rimGusi.append(hundreds[(years%1000)/100]);
        rimGusi.append(tens[(years%100)/10]);
        rimGusi.append(ones[years%10]);

        System.out.println(years + " лет - это " + rimGusi.toString() + " в римской системе счисления");
    }
}