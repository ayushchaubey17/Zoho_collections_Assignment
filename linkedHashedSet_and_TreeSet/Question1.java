import java.util.LinkedHashSet;

public class Question1 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of integers
        LinkedHashSet<Integer> numbersSet = new LinkedHashSet<>();

        // Add numbers to the set
        numbersSet.add(5);
        numbersSet.add(10);
        numbersSet.add(15);
        numbersSet.add(20);
        numbersSet.add(25);

        // Attempt to add a duplicate number
        boolean isAdded = numbersSet.add(15);

        // Print the elements of the set
        System.out.println("Elements in the LinkedHashSet: " + numbersSet);

        // Check if duplicate was added
        if (isAdded) {
            System.out.println("The number 15 was added again.");
        } else {
            System.out.println("The number 15 was not added again (duplicate).");
        }
    }
}
