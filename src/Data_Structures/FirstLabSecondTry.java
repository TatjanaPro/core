package Data_Structures;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FirstLabSecondTry {
    public static void main(String[] args) {
        int n = 10; // Define the size of the array
        int min = 100;
        int max = 1000;

        int[] arr = generateRandomArray(n + 2, min, max);
        System.out.println("Array: ");
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();


        // Secīga meklēšana ar barjeru
        long startTime = System.nanoTime();
        int index = sequentialSearchWithBarrier(arr, x);
        long endTime = System.nanoTime();
        long time = endTime - startTime;

        int result = searchWithBarrier(arr, x, n);
        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found!");
        }
    }

    private static int sequentialSearchWithBarrier(int[] arr, int x) {
        return x;
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        return IntStream
                .generate(() -> min + new Random().nextInt(max - min + 1))
                .limit(size)
                .toArray();
    }

    public static int searchWithBarrier(int[] arr, int x, int n) {
        if (n >= arr.length - 1) {
            return -1; // The array is too small for the given n.
        }

        arr[arr.length - 1] = x; // Set the barrier
        int i = 4;

        while (i < arr.length - 1 && (arr[i - 3] - x) * (arr[i - 2] - x) * (arr[i - 1] - x) * (arr[i] - x) != 0) {
            i = i + 4;
        }

        if (arr[i - 3] == x) {
            i = i - 3;
        } else if (arr[i - 2] == x) {
            i = i - 2;
        } else if (arr[i - 1] == x) {
            i = i - 1;
        }

        if (i < arr.length - 1) {
            return i;
        } else {
            return -1;
        }
    }
}