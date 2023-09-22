package ArrLesson;

import java.util.ArrayList;
import java.util.Collections;

public class Arr {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(1);
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(4);

        stringArrayList.add("b");
        stringArrayList.add("d");
        stringArrayList.add("c");
        stringArrayList.add("e");
        stringArrayList.add("a");

        Collections.sort(integerArrayList);
        Collections.sort(stringArrayList);

        System.out.println(integerArrayList);
        System.out.println(stringArrayList);

    }
}
