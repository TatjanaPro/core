package OOP;

public class Triangle extends RightTriangle {

    private int height;
    double area;

    public Triangle (int sideA, int sideB, int sideC, int height){
        super(sideA, sideB, sideC);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    void calculatePerimeter () {
        double perimeter = getSideA() + getSideB() + getSideC();
        System.out.println("Perimeter of triangle is " + perimeter + " cm.");
    }
    void calculateArea() {
        area = (getSideA() * getHeight()) / 2;
        System.out.println("Triangle area is " + area + " cm.");
    }
}
