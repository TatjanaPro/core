package OOP2Lab;

public class Main {
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle(3, 4) {
        };
        rightTriangle.calcPerimeter();

        Triangle triangle = new Triangle(2, 4, 5);
        triangle.calcPerimeter();
    }
}

