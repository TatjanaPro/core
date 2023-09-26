package ArrLesson;

import java.util.HashMap;

public class Arr2 {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4};

        int sum = 0;

        for (int i : arr)
            sum += i;
        double ave = (double) sum / arr.length;
            System.out.println("sum: " + sum + " avr: " + ave);


    }
}
