

import java.util.Stack;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // Initialize a Stack of doubles
        Stack<Double> stack = new Stack<>();
        
        // Push values onto the Stack
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);
        
        // Print the original Stack
        System.out.println("Original Stack: " + stack);
        
        // Convert the Stack to an array
        Double[] array = stack.toArray(new Double[0]);
        
        // Print the array
        System.out.println("Array elements: " + Arrays.toString(array));
        
        // Create a new Stack from the array
        Stack<Double> newStack = new Stack<>();
        for (Double value : array) {
            newStack.push(value);
        }
        
        // Print the elements of the new Stack
        System.out.println("New Stack elements: " + newStack);
    }
}
