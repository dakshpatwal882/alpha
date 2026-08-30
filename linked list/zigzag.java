public class zigzag {

    // Node structure of the linked list
    public static class node {
        int data;
        node next;

        // Constructor to create a new node
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the linked list
    public static node head;
    public static node tail;

    // Stores number of nodes
    public static int size;

    // Add a new node at the end
    public void add(int data) {
        node newNode = new node(data);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // Add node after tail
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Convert linked list into Zig-Zag form
    public void zig() {

        // 1. Find the middle of the linked list
        node slow = head;
        node fast = head;

        // Slow moves 1 step, fast moves 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle node
        node mid = slow;

        // 2. Reverse the second half
        node current = mid.next;

        // Separate first and second half
        mid.next = null;

        node prev = null;
        node next;

        // Reverse the second half
        while (current != null) {
            next = current.next;    // Save next node
            current.next = prev;    // Reverse the link
            prev = current;         // Move prev forward
            current = next;         // Move current forward
        }

        // 3. Merge both halves alternately
        node left = head;
        node right = prev;

        node nextL;
        node nextR;

        while (left != null && right != null) {

            // Save next node of left half
            nextL = left.next;

            // Connect left node to right node
            left.next = right;

            // Save next node of right half
            nextR = right.next;

            // Connect right node to next left node
            right.next = nextL;

            // Move both pointers forward
            left = nextL;
            right = nextR;
        }
    }

    // Print the linked list
    public void print() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list object
        zigzag ll = new zigzag();

        // Add elements
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(5);

        // Print original list
        System.out.println("Before Zig-Zag:");
        ll.print();

        // Convert into Zig-Zag
        ll.zig();

        // Print modified list
        System.out.println("After Zig-Zag:");
        ll.print();
    }
}