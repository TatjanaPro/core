package w3resource;

public class Shape {
    public int getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getArea() {
        return length * width;
    }
}

class Main3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        int area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}