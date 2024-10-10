import java.util.LinkedHashSet;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        LinkedHashSet<String> colorSet = new LinkedHashSet<>();
        colorSet.add("red");
        colorSet.add("green");
        colorSet.add("blue");
        colorSet.add("yellow");

        // Print the original set
        System.out.println("Original LinkedHashSet: " + colorSet);

        // Convert LinkedHashSet to an array
        String[] colorArray = colorSet.toArray(new String[0]);

        // Print the array
        System.out.println("Array from LinkedHashSet: " + Arrays.toString(colorArray));

        // Convert the array back to a LinkedHashSet
        LinkedHashSet<String> newColorSet = new LinkedHashSet<>(Arrays.asList(colorArray));

        // Print the new LinkedHashSet
        System.out.println("LinkedHashSet from array: " + newColorSet);
    }
}
