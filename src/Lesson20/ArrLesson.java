package Lesson20;
public class ArrLesson {

    public static int[] sortirovka(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j];
                index = j;
            }

            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 0, 8, 4, 2};
        sortirovka(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
