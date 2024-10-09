import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        // Test cases
        String input1 = "(())";
        String input2 = "(()";
        String input3 = "(()())";
        String input4 = "())(";

        System.out.println("Is the string \"" + input1 + "\" balanced? " + isBalanced(input1));
        System.out.println("Is the string \"" + input2 + "\" balanced? " + isBalanced(input2));
        System.out.println("Is the string \"" + input3 + "\" balanced? " + isBalanced(input3));
        System.out.println("Is the string \"" + input4 + "\" balanced? " + isBalanced(input4));
    }

    // Method to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        // Create a Stack to hold opening parentheses
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Push opening parentheses onto the stack
            if (c == '(') {
                stack.push(c);
            } 
            // Check for closing parentheses
            else if (c == ')') {
                // If stack is empty or no matching opening parenthesis, return false
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop(); // Pop the matching opening parenthesis
            }
        }
        
        // If the stack is empty at the end, the string is balanced
        return stack.isEmpty();
    }
}
