package w3resourceAbstract;

abstract public class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    private double pi;

    public Circle (double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle (double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        return (height * sideB) / 2;
    }
}

class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.00, 3.14);
        Triangle triangle = new Triangle(2.00, 4.00, 5.00, 3.00);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}