package Lesson26;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }
    public void sleep() {
        System.out.println("It is always fascinating to watch sleeping fish");
    }

    abstract void swim();
}
