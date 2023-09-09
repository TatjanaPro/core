package Lesson26;

public class Penguin extends Bird {
    String name;
    public Penguin (String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Penguins favorite foods is fish");
    }
    public void sleep() {
        System.out.println("Penguins sleeps close to each over");
    }
    public void fly() {
        System.out.println("Penguins cant fly");
    }
    public void speak() {
        System.out.println("Penguins are not the best singers");
    }
}
