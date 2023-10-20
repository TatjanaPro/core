package OOP;

public class RightTriangle {

    private int sideA;
    private int sideB;
    private int sideC;
    double perimeter;

    public RightTriangle (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    void calculatePerimeter () {
        perimeter = getSideA() + getSideB() + getSideC();
        System.out.println("Perimeter of right triangle is " + perimeter + " cm.");
    }
}
