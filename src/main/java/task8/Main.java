package task8;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int [] info = input.getInfo();
        Triangle triangle = new Triangle(info);
        triangle.IsThereTriangle();
        if (triangle.findAngle() == 0) {
            System.out.println("Треугольника не существует, так что и угол найти не получится");
        } else {
            System.out.println("Наибольший внешний угол данного треугольника = " + triangle.findAngle());
        }
    }
}