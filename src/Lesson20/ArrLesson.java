package Lesson20;

public class ArrLesson {

    public static int[] sortirovka(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i]; //arr[0] = 15
            int index = i; // index = 0
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                min = arr[j]; // min = arr[1] = 3
                index = j; //index = 1
            }
        }
            if (i != index) {
                a = arr[i]; //a = 15
                arr[i] = min; //arr[0] = 3
                arr[index] = a; //arr[1] = 15
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 8};
        sortirovka(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
