class SimpleStack {
    // Top points to the head node of the stack
    Node top;

    // Inner node class (plain, no private/static/generics)
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Push: insert at the beginning (top)
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    // Pop: remove and return from the beginning (top)
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek: look at the top element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Test driver
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());   // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
        System.out.println("Empty? " + stack.isEmpty()); // false
    }
}