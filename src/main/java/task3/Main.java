package task3;

public class Main {
    public static void main(String[] args) {
        Coordinates coo = new Coordinates();
        float [] A = coo.coordinates();
        float [] B = coo.coordinates();
        float [] C = coo.coordinates();
        Triangle triangle = new Triangle(A, B, C);
        System.out.println("Барицентр заданного треугольника находится в координатах [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }
}
