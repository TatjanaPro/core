package OOP2Lab;

public abstract class RightTriangle implements CalculatePerimeter {
    double perimeter;
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB) {
        this.legA = legA;
        this.legB = legB;
    }

    public int getLegA() {
        return legA;
    }

    public int getLegB() {
        return legB;
    }

    @Override
    public void calcPerimeter() {
        perimeter = getLegA() + getLegB() + Math.sqrt(getLegA() * getLegA() + getLegB() * getLegB());
        System.out.println("Right Triangle perimeter is " + perimeter);
    }
}
