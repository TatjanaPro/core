package Random;

import java.util.ArrayList;
import java.util.Collections;

public class RandomLessons {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(10);
        System.out.println("Array list before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Array list after sort");
        System.out.println(list);


    }
}

