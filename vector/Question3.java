import java.util.Vector;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        // Initialize a Vector with string values
        Vector<String> colors = new Vector<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        
        // Convert the Vector to an array
        String[] colorsArray = colors.toArray(new String[0]);
        
        // Print the array
        System.out.println("Array elements: " + Arrays.toString(colorsArray));
        
        // Convert the array back to a Vector
        Vector<String> colorsVector = new Vector<>(Arrays.asList(colorsArray));
        
        // Print the resulting Vector
        System.out.println("Vector elements after conversion from array: " + colorsVector);
    }
}
