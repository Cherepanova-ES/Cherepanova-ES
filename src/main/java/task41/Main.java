package task41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int sec = vvod.nextInt();
        String time = conSec(sec);
        System.out.println(time);
    }

    public static String conSec(int sec) {
        int year = sec / (365 * 24 * 60 * 60);
        sec %= (365 * 24 * 60 * 60);
        int month = sec / (30 * 24 * 60 * 60);
        sec %= (30 * 24 * 60 * 60);
        int week = sec / (7 * 24 * 60 * 60);
        sec %= (7 * 24 * 60 * 60);
        int day = sec / (24 * 60 * 60);
        sec %= (24 * 60 * 60);
        int hour = sec / (60 * 60);
        sec %= (60 * 60);
        int minute = sec / 60;
        sec %= 60;

        StringBuilder strb = new StringBuilder();
        if (year > 0) {
            strb.append(year).append(" год");
            if (year > 1) {
                strb.append("а");
            }
            strb.append(", ");
        }
        if (month > 0) {
            strb.append(month).append(" месяц");
            if (month > 1) {
                strb.append("а");
            }
            strb.append(", ");
        }
        if (week > 0) {
            strb.append(week).append(" недел");
            if (week > 1) {
                strb.append("и");
            }
            strb.append(", ");
        }
        if (day > 0) {
            strb.append(day).append(" день, ");
        }
        if (hour > 0) {
            strb.append(hour).append(" час");
            if (hour > 1) {
                strb.append("а");
            }
            strb.append(", ");
        }
        if (minute > 0 && (year > 0 || month > 0 || week > 0 || day > 0 || hour > 0)) {
            strb.append(minute).append(" минут");
            if (minute > 1) {
                strb.append("ы");
            }
            strb.append(" и ");
        } else if (minute > 0) {
            strb.append(minute).append(" минут");
            if (minute > 1) {
                strb.append("ы");
            }
            strb.append(", ");
        }
        strb.append(sec).append(" секунд");
        if (sec > 1) {
            strb.append("ы");
        }

        return strb.toString();
    }
}
