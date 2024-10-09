import java.util.Vector;

public class Question1 {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        
        // Add integers to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int thirdElement = numbers.get(2);  // Index 2 corresponds to the third element
        System.out.println("Element at second index (third element): " + thirdElement);
        
        System.out.println("All elements in the Vector: " + numbers);
    }
}
