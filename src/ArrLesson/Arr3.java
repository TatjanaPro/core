package ArrLesson;

import java.util.ArrayList;
import java.util.Collections;

public class Arr3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("First list: " + list);
        list.add(0, "Pink");
        list.add(4, "Yellow");
        System.out.println("Added a few elements: " + list);
        System.out.println("Get a specified index: " + list.get(1));
        list.set(1, "Orange");
        System.out.println("List after update: " + list);
        list.remove(2);
        System.out.println("List after delete: " + list);

        if (list.contains("Green")) {
            System.out.println("Founded");
        } else {
            System.out.println("Not found");
        }
        Collections.sort(list);


        for (String s : list) {
            System.out.println(s);
        }
    }
}
