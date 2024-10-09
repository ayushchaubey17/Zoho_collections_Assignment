//3. Write a Java program that creates an `ArrayList` of characters. Add ten different characters to the list. Write a method that takes a character as an argument and returns the index of the character in the list. If the character is not found, return -1.
import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        // Create an ArrayList of characters
        ArrayList<Character> characters = new ArrayList<>();

        // Add ten different characters to the list
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');
        characters.add('H');
        characters.add('I');
        characters.add('J');

        // Test the method with a character that exists and one that doesn't
        char searchChar1 = 'E';
        char searchChar2 = 'Z';

        System.out.println("Index of '" + searchChar1 + "': " + findCharacterIndex(characters, searchChar1));
        System.out.println("Index of '" + searchChar2 + "': " + findCharacterIndex(characters, searchChar2));
    }

    // Method to find the index of a character in the list
    public static int findCharacterIndex(ArrayList<Character> list, char ch) {
        // Loop through the list to find the index of the character
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ch) {
                return i; // Return index if character is found
            }
        }
        return -1; // Return -1 if character is not found
    }
}
