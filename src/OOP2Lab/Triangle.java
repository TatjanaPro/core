package OOP2Lab;

public class Triangle extends RightTriangle {
    private int legC;


    public Triangle(int legA, int legB, int legC) {
        super(legA, legB);
        this.legC = legC;
    }

    public int getLegC() {
        return legC;
    }
    public void calcPerimeter() {
       perimeter = getLegA() + getLegB() + getLegC();
        System.out.println("Triangle perimeter is " + perimeter);
    }
}
