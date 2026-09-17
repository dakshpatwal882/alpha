// Import the legacy Stack class from the Java Collections Framework
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create an empty stack that holds Integer objects
        Stack<Integer> stack = new Stack<>();

        // PUSH: Add elements one by one onto the top of the stack
        stack.push(10); // 10 is at the bottom
        stack.push(20); // 20 sits above 10
        stack.push(30); // 30 is placed on top

        // PEEK: Look at the top element (30) without removing it
        System.out.println(stack.peek()); // Output: 30

        // POP: Remove and return the top element (30)
        System.out.println(stack.pop());  // Output: 30

        // POP: Remove and return the next top element (20)
        System.out.println(stack.pop());  // Output: 20
    }
}