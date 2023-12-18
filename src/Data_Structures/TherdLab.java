package Data_Structures;

import java.util.LinkedList;
import java.util.Random;

public class TherdLab {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("List output before: " + list);

        for (int i = 1; i <= 3; i++) {
            list.add(2, rand.nextInt(100));
        }
        System.out.println("List after adding 3 new elements after second element: " + list);

        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = sum / list.size();
        System.out.println("Average: " + average);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < average) {
                list.remove(i);
                i--;

            }
        }
        System.out.println("List after deleting element that are smaller then " + average + ": " + list);
    }
}
