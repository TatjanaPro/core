package Lesson26;

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
