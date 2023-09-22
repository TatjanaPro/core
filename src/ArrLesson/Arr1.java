package ArrLesson;

public class Arr1 {
    public static void main(String[] args) {
        int my_array [] = {1, 2, 3};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("Sum " + sum);
    }
}
