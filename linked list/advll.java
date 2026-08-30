public class advll {

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;
    // Floyd Cycle Finding Algorithm
    public static boolean iscycle() {

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove cycle
    public static void removecycle() {

        // 1. Detect cycle
        node slow = head;
        node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle) {
            return;
        }

        // 2. Find cycle starting point
        slow = head;

        // Cycle starts at head
        if (slow == fast) {

            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
            return;
        }

        // Normal case
        node prev = null;

        while (slow != fast) {

            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // 3. Remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {

        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        // Create cycle
        head.next.next.next = head;

        System.out.println(iscycle());

        removecycle();

        System.out.println(iscycle());
    }
}
