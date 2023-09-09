package Lesson26;

public class Main {
    public static void main(String[] args) {
        Swordfish sw = new Swordfish("Poppy");
        System.out.println("Swordfish name: " + sw.name);
        sw.swim();
        sw.eat();
        sw.sleep();

        Speakable sp = new Penguin("Jack");
        sp.speak();
        Animal a = new Lion("Lord");
        System.out.println("Lion name: " + a.name);
        a.eat();
        a.sleep();
        Mammal m = new Lion("Lord2");
        System.out.println("Lion2 name: " + m.name);
        m.eat();
        m.run();
        m.sleep();
        m.speak();
    }
}
