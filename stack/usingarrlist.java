// Import the dynamic array collection to serve as our internal backing store
import java.util.ArrayList;
// Import the standard runtime exception to throw when an empty stack is accessed illegally
import java.util.EmptyStackException;

// Define a generic Stack class where T represents any non-primitive data type (e.g., Integer, String)
public class usingarrlist<T> {

    // Internal dynamic array that holds stack elements; 'final' ensures this reference cannot be reassigned
    private final ArrayList<T> list;

    // Constructor: executes when creating a new instance of the stack
    public usingarrlist() {
        // Allocate a new, empty ArrayList on the heap
        this.list = new ArrayList<>();
    }

    // Push operation: places a new item onto the top of the stack
    public void push(T item) {
        // Appends the element to the end of the ArrayList in O(1) amortized time (no index shifting needed)
        list.add(item);
    }

    // Pop operation: removes and returns the most recently pushed (top) element
    public T pop() {
        // Check if there are no elements to prevent an IndexOutOfBoundsException
        if (isEmpty()) {
            // Abort execution and signal the caller that the stack has no items
            throw new EmptyStackException();
        }
        // Remove and return the last element at index (size - 1) in O(1) time
        return list.remove(list.size() - 1);
    }

    // Peek operation: inspects the top element without altering the stack
    public T peek() {
        // Ensure the stack contains at least one item before attempting to read
        if (isEmpty()) {
            // Abort execution and signal the caller that the stack has no items
            throw new EmptyStackException();
        }
        // Retrieve and return the last element at index (size - 1) in O(1) time without removing it
        return list.get(list.size() - 1);
    }

    // Helper: checks whether the stack contains any items
    public boolean isEmpty() {
        // Delegates directly to ArrayList's isEmpty method, returning true if size == 0
        return list.isEmpty();
    }

    // Helper: returns the total number of items currently in the stack
    public int size() {
        // Returns the count of elements currently present in the underlying list
        return list.size();
    }

    // Execution entry point to run and test the stack implementation
    public static void main(String[] args) {
        // Instantiate the stack specifically configured to store Integer objects
        usingarrlist<Integer> stack = new usingarrlist<>();

        // Add elements to the stack; 10 goes to index 0 (bottom of the stack)
        stack.push(10);
        // 20 goes to index 1
        stack.push(20);
        // 30 goes to index 2 (current top of the stack)
        stack.push(30);

        // Read the current top item (30) without modifying the stack; prints "Top element (peek): 30"
        System.out.println("Top element (peek): " + stack.peek());

        // Remove and return the top item (30); list now contains [10, 20]; prints "Popped: 30"
        System.out.println("Popped: " + stack.pop());

        // Remove and return the next top item (20); list now contains [10]; prints "Popped: 20"
        System.out.println("Popped: " + stack.pop());

        // Check the number of remaining elements; prints "Current size: 1"
        System.out.println("Current size: " + stack.size());

        // Check if the stack has any elements remaining; prints "Is empty? false"
        System.out.println("Is empty? " + stack.isEmpty());
    }
}