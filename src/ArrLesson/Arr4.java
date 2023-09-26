package ArrLesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arr4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Pink");

        System.out.println(list);
        List <String> subList = list.subList(3,5);
        System.out.println(list);
        System.out.println(subList);




    }
}
