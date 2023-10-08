package Data_Structures;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstLab {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Ievadiet masīva izmēru (n): ");
            int n = scanner.nextInt();

            // Izveidojam un aizpildām masīvu ar gadījuma skaitļiem
            int[] masivs = new int[n];
            for (int i = 0; i < n; i++) {
                masivs[i] = random.nextInt(1000); // Variējiet diapazonu, ja nepieciešams
            }

            // Izvadām sākotnējo masīvu
            System.out.println("Sākotnējais masīvs:");
            System.out.println(Arrays.toString(masivs));

            // Meklējam atslēgu
            System.out.print("Ievadiet atslēgu vērtību: ");
            int atslega = scanner.nextInt();

            // Secīga meklēšana ar barjeru
            long startTime = System.nanoTime();
            int index = sequentialSearchWithBarrier(masivs, atslega);
            long endTime = System.nanoTime();
            long seciigaisLaiks = endTime - startTime;

            if (index != -1) {
                System.out.println("Atslēga " + atslega + " atrasta sākuma masīvā (secīgā meklēšana) pie indeksa " + index);
                System.out.println("Secīgā meklēšana aizņēma " + seciigaisLaiks + " nanosekundes.");
            } else {
                System.out.println("Atslēga " + atslega + " netika atrasta sākuma masīvā (secīgā meklēšana)");
            }

            // Sakārtojam masīvu
            Arrays.sort(masivs);

            // Binārā meklēšana
            startTime = System.nanoTime();
            index = binarySearch(masivs, atslega);
            endTime = System.nanoTime();
            long binaraisLaiks = endTime - startTime;

            if (index != -1) {
                System.out.println("Atslēga " + atslega + " atrasta sakārtotajā masīvā (binārā meklēšana) pie indeksa " + index);
                System.out.println("Binārā meklēšana aizņēma " + binaraisLaiks + " nanosekundes.");
            } else {
                System.out.println("Atslēga " + atslega + " netika atrasta sakārtotajā masīvā (binārā meklēšana)");
            }
        }

        // Secīga meklēšana ar barjeru
        public static int sequentialSearchWithBarrier(int[] masivs, int atslega) {
            masivs[masivs.length - 1] = atslega; // Ievietojam barjeru

            int i = 0;
            while (masivs[i] != atslega) {
                i++;
            }

            if (i == masivs.length - 1) {
                return -1; // Atslēga nav atrasta
            } else {
                return i;
            }
        }

        // Binārā meklēšana
        public static int binarySearch(int[] masivs, int atslega) {
            int low = 0;
            int high = masivs.length - 1;

            while (low <= high) {
                int middle = (low + high) / 2;
                if (masivs[middle] == atslega) {
                    return middle;
                } else if (masivs[middle] < atslega) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }

            return -1; // Atslēga nav atrasta
        }
    }
