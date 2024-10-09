import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        // Input string to be reversed
        String input = "hello";
        
        // Call the method to reverse the string
        String reversed = reverseString(input);
        
        // Print the reversed string
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
    
    // Method to reverse a string using a Stack
    public static String reverseString(String str) {
        // Create a Stack to hold characters
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the string onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reversedStr = new StringBuilder();
        
        // Pop each character from the stack and append it to the StringBuilder
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        
        return reversedStr.toString();
    }
}
