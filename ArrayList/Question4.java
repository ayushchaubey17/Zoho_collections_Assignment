import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Step 2: Convert the ArrayList to an array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);

        // Step 3: Print the array
        System.out.println("Array:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // Step 4: Convert the array back to an ArrayList
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruitArray));

        // Step 5: Print the ArrayList
        System.out.println("\nArrayList:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
