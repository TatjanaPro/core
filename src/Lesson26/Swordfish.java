package Lesson26;

public class Swordfish extends Fish {

    public Swordfish (String name) {
        super(name);
        this.name = name;
    }
    public void swim() {
        System.out.println("The Swordfish is a beautiful fish and are a fast swimmer");
    }
    public void eat() {
        System.out.println("The Swordfish eats fish food");
    }
}
