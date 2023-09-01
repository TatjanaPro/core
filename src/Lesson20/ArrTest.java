package Lesson20;
//{1, 9, 0, 5}

public class ArrTest {

    public static int[] sortirovka(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                a = arr[i]; //1
                arr[i] = min; //0
                arr[index] = a;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {15, 3, 5, 8, 4, 2};
        sortirovka(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
