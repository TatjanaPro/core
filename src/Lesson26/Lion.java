package Lesson26;

public class Lion extends Mammal {
    public Lion (String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Lions eat raw meat");
    }
    public void sleep() {
        System.out.println("Lions sleep a lot");
    }
    public void run() {
        System.out.println("Lion not the fastest cat in the world");
    }
}
