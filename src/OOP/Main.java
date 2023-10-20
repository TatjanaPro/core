package OOP;

public class Main {
    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle(2, 4, 6);
        rt.calculatePerimeter();

        Triangle tr = new Triangle(3, 5, 8, 2);
        tr.calculatePerimeter();
        tr.calculateArea();
    }
}
