import java.util.Stack;

public class Question1{
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
        
        // Push integers onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        // Print the stack before popping
        System.out.println("Stack before popping: " + stack);
        
        // Pop the top element (50)
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        // Print the remaining elements in the stack
        System.out.println("Remaining elements in the stack: " + stack);
    }
}