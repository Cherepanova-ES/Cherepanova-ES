package task22;

public class Main {
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    Main main = new Main();
    double area = main.calculateArea(3, 4, 5);

}

