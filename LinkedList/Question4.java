import java.util.LinkedList;
import java.util.ListIterator;

public class Question4 {
    
      
    public static void main(String[] args) {
        // Create a LinkedList of characters
        LinkedList<Character> characters = new LinkedList<>();
        
        // Add characters 'A', 'B', 'C', 'D', 'E' to the LinkedList
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        
        // Print the original list
        System.out.println("Original list: " + characters);
        
        // Call the method to reverse the list and print it
        reverseList(characters);
    }
    
    // Method to reverse the LinkedList
    public static void reverseList(LinkedList<Character> list) {
        // Create a new LinkedList to store the reversed list
        LinkedList<Character> reversedList = new LinkedList<>();
        
        // Use a ListIterator starting from the end of the list
        ListIterator<Character> iterator = list.listIterator(list.size());
        
        // Iterate backwards and add each element to the new list
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        
        // Print the reversed list
        System.out.println("Reversed list: " + reversedList);
    }
}
