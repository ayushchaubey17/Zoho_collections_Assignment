import java.util.ArrayList;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        // Initialize an ArrayList of integers with given values
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Create an iterator to iterate through the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate and remove elements greater than 30
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > 30) {
                iterator.remove();  // Remove elements greater than 30
            }
        }

        // Print the modified list
        System.out.println("Modified list: " + numbers);
    }
}
