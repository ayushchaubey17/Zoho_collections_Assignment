import java.util.Vector;
import java.util.Random;


public class Question2 {

    public static void main(String[] args) {
        Vector<Double> numbers = new Vector<>();
        
// Add five random double values to the Vector
Random random = new Random();
for (int i = 0; i < 5; i++) {
    numbers.add(random.nextDouble() * 100);  // Random double between 0 and 100
}

// Print the elements in the Vector
System.out.println("Vector elements: " + numbers);

// Check if 10.5 is in the Vector
if (numbers.contains(10.5)) {
    System.out.println("The value 10.5 is in the vector.");
} else {
    System.out.println("The value 10.5 is NOT in the vector.");
}

// Print the size of the Vector before adding another value
System.out.println("Size of the vector before adding another value: " + numbers.size());

// Add another double value to the Vector
numbers.add(55.5);

// Print the size of the Vector after adding the value
System.out.println("Size of the vector after adding another value: " + numbers.size());

    }
}  