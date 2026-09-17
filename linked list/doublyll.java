public class doublyll {

    // Node of Doubly Linked List
    public static class Node {
        int data;
        Node next;
        Node prev;   // Extra pointer in DLL

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head and tail of DLL
    public static Node head;
    public static Node tail;
    public static int size;

    // Add element at first
    public void addFirst(int data) {

        // Create new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // New node points to current head
        newNode.next = head;

        // Current head points back to new node
        head.prev = newNode;

        // Make new node the head
        head = newNode;

        size++;
    }

    // Add element at last
    public void addLast(int data) {

        // Create new node
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // New node points back to current tail
        newNode.prev = tail;

        // Current tail points to new node
        tail.next = newNode;

        // Make new node the tail
        tail = newNode;

        size++;
    }

    // Remove first element
    public int removeFirst() {

        // If list is empty
        if (head == null) {
            System.out.println("DLL is empty");
            return -1;
        }

        int value = head.data;

        // If only one node
        if (head == tail) {
            head = tail = null;
        } 
        else {
            // Move head to next node
            head = head.next;

            // Remove backward connection
            head.prev = null;
        }

        size--;
        return value;
    }

    // Remove last element
    public int removeLast() {

        // If list is empty
        if (head == null) {
            System.out.println("DLL is empty");
            return -1;
        }

        int value = tail.data;

        // If only one node
        if (head == tail) {
            head = tail = null;
        } 
        else {
            // Move tail to previous node
            tail = tail.prev;

            // Remove forward connection
            tail.next = null;
        }

        size--;
        return value;
    }

    // Reverse the Doubly Linked List
    public void reverse() {

        Node current = head;
        Node next;

        // Swap next and prev of every node
        while (current != null) {

            next = current.prev;
            current.prev = current.next;
            current.next = next;

            current = current.prev;
        }

        // Swap head and tail
        next = head;
        head = tail;
        tail = next;
    }

    // Print DLL
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        doublyll dll = new doublyll();

        // Add elements
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);

        System.out.println("Original DLL:");
        dll.print();

        // Remove first
        System.out.println("Removed First: " + dll.removeFirst());
        dll.print();

        // Remove last
        System.out.println("Removed Last: " + dll.removeLast());
        dll.print();

        // Reverse
        dll.reverse();

        System.out.println("After Reverse:");
        dll.print();
    }
}

