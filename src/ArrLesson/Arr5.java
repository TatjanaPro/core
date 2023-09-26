package ArrLesson;

import java.util.Iterator;
import java.util.LinkedList;

public class Arr5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println(list);
        Iterator<String> p = list.listIterator(2);

        while (p.hasNext()) {
            System.out.println(p.next());
        }

    }
}
