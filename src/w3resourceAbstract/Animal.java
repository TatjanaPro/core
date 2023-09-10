package w3resourceAbstract;

abstract public class Animal {
    abstract void sound();
}
class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roar");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("Tiger roar");
    }
}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}