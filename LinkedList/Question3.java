import java.util.LinkedList;

public class Question3 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        
        // Add numbers 1 to 10 to the LinkedList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        // Remove the third element (index 2)
        numbers.remove(2);  // Index starts at 0, so 2 is the third element
        
        // Remove the last element
        numbers.removeLast();
        
        // Print the resulting list
        System.out.println("Modified list: " + numbers);
    }
}

