package task3;

public class Triangle {
    private float [] A;
    private float [] B;
    private float [] C;
    public Triangle(float [] A, float [] B, float [] C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public float getXBarycenter() {
        return (A[0] + B[0] + C[0])/3;
    }
    public float getYBarycenter() {
        return (A[1] + B[1] + C[1])/3;
    }
}
