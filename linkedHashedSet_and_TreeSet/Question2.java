import java.util.LinkedHashSet;

public class Question2
 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of characters
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Add characters to the set
        charSet.add('A');
        charSet.add('B');
        charSet.add('C');
        charSet.add('D');
        charSet.add('E');

        // Print the set before removal
        System.out.println("Original LinkedHashSet: " + charSet);

        // Remove the character 'C'
        boolean isRemoved = charSet.remove('C');

        // Check if 'C' was removed
        if (isRemoved) {
            System.out.println("The character 'C' was removed from the set.");
        } else {
            System.out.println("The character 'C' was not found in the set.");
        }

        // Check if 'C' is still in the set
        boolean containsC = charSet.contains('C');
        if (containsC) {
            System.out.println("'C' is still in the set.");
        } else {
            System.out.println("'C' is no longer in the set.");
        }

        // Print the set after removal
        System.out.println("LinkedHashSet after removal: " + charSet);
    }
}
