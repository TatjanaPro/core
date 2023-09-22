package Random;

import java.util.ArrayList;
import java.util.Collections;

public class BinSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-30);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(150);
        list.add(19);
        Collections.sort(list);
        int index = Collections.binarySearch(list, 19);
        System.out.println(index);
    }
}
