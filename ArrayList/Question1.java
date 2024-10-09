//1. Write a Java program that creates an `ArrayList` of strings. Add five different fruits to the list,
// then retrieve and print the third fruit in the list.


import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add five different fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Grapes");

        // Retrieve and print the third fruit in the list (index 2 because it's zero-based)
        String thirdFruit = fruits.get(2);
        System.out.println("The third fruit in the list is: " + thirdFruit);
    }
}

