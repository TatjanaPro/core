package Data_Structures;
import java.util.Random;
import java.util.Scanner;

public class SecondLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of array: ");
        int arrSize = scanner.nextInt();

        // Izveidojam un aizpildām masīvu ar gadījuma skaitļiem
        int[] arr = new int[arrSize];//
        for (int i = 0; i < arrSize; i++) {
            arr[i] = random.nextInt(901) + 100;
        }

        // Izvadām sākotnējo masīvu
        System.out.print("An array: ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //masīva kopija
        int[] sortedArr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            sortedArr[i] = arr[i];
        }

        int bubbleCounter = bubbleSort(arr);

        System.out.print("Improved bubble sorted array: ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Total steps taken after improved bubble sort is " + bubbleCounter);

        int shellCounter = shellSort(sortedArr);

        System.out.print("Shell sorted array: ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();

        System.out.println("Total steps taken after shell sort is " + shellCounter);

    }

    public static int bubbleSort (int[] arr) {
        int bubbleCount = 0;
        int lastSwap = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;
            for (int j = 0; j < lastSwap; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;
                }
                bubbleCount++;
            }
            if (is_sorted) {
                break;
            }
            lastSwap = currentSwap;
        }
        return bubbleCount;
    }

    public static int shellSort (int[] arr) {
        int shellCount = 0;
        int t = (int) (Math.log(arr.length) / Math.log(2)) - 1; // Calculate distance count
        int[] d = new int[t];
        d[0] = 1;

        for (int i = 1; i < t; i++) {
            d[i] = 2 * d[i - 1] + 1;
        }

        for (int m = t - 1; m >= 0; m--) {
            int k = d[m];
            for (int i = k; i < arr.length; i++) {
                int x = arr[i];
                int j = i - k;
                while (j >= 0 && x < arr[j]) {
                    arr[j + k] = arr[j];
                    j = j - k;
                    shellCount++;
                }
                arr[j + k] = x;
            }
        }
        return shellCount;
    }
}
