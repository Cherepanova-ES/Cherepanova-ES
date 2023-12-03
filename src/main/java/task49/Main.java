package task49;

public class Main {
    public static int fibon(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(fibon(0) + "\n" + fibon(1) +
                "\n" + fibon(2) + "\n" + fibon(13));
    }
}

