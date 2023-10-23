package Data_Structures;
import java.util.Random;
import java.util.Scanner;

public class FirstLab {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Enter size of array: ");
            int arrSize = scanner.nextInt();

            // Izveidojam un aizpildām masīvu ar gadījuma skaitļiem
            int[] arr = new int[arrSize + 1];//
            for (int i = 0; i < arrSize; i++) {
                arr[i] = random.nextInt(901) + 100;
            }

            // Izvadām sākotnējo masīvu
            System.out.print("An array: ");
            for (int i = 0; i < arrSize; i++) {
                System.out.print(arr[i] + " ");
            }
           System.out.println();

            // Meklējam atslēgu
            System.out.print("Enter searched key: ");
            int key = scanner.nextInt();
            arr[arrSize] = key; //set the barjer

            // Secīga meklēšana ar barjeru
            int resultIndex = searchWithBarrier(arr, key);
            int counter = searchWithBarrier(arr, key);

            if (resultIndex != -1) {
                System.out.println("Sequential search: The searched key " + key + " was found on index " + resultIndex + " and it took " + counter + " steps");
            } else {
                System.out.println("Sequential search: The searched key " + key + " was not found");
            }

            //masīva kopija
            int[] sortedArr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                sortedArr[i] = arr[i];
            }
            bubbleSort(sortedArr);

            // Sakārtojam masīvu
            System.out.println("Sorted Array:");
            for (int i = 0; i < arrSize; i++) {
                System.out.print(sortedArr[i] + " ");
            }
            System.out.println();

            // Binārā meklēšana
            int indexBinary = binarySearch(sortedArr, key);
            int counterBinary = binarySearchCounter(sortedArr, key);

            if (indexBinary != -1) {
                System.out.println("Binary search: The searched key " + key + " was found on index " + indexBinary + " and it took " + counterBinary + " steps");
            } else {
                System.out.println("Binary search: The searched key " + key + " was not found");
            }
        }

        // Secīga meklēšana ar barjeru
        public static int searchWithBarrier(int[] arr, int key) {

            int i = 0;
            int counter = 0;
            while (arr[i] != key) {
                i++;
                counter++;
            }

            if (i == arr.length - 1) {
                return -1; // Atslēga nav atrasta
            } else {
                return counter;
            }
        }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
        // Binārā meklēšana
        public static int binarySearch(int[] arr, int key) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int middle = left + (right - left) / 2;

                if (arr[middle] == key) {
                    return middle;
                } if (arr[middle] < key) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            return -1; // Atslēga nav atrasta
        }

    public static int binarySearchCounter(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int counterBinary = 0;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            counterBinary++;

            if (arr[middle] == key) {
                return counterBinary;
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return counterBinary;
    }
}
