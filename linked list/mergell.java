public class mergell {

    // Node structure of the singly linked list
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    public static node head;
    public static node tail;
    public static int size;

    // Finds the middle node of the list using slow and fast pointers
    // The slow pointer moves 1 step, fast pointer moves 2 steps
    private static node getmid(node head) {
        node slow = head;
        node fast = head.next; // start from next to get the second half correctly

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle node
    } 

    // Merges two sorted linked lists into one sorted linked list
    private static node merge(node head1, node head2) {
        // Dummy node to simplify adding nodes without special cases
        node mergedll = new node(-1);
        node temp = mergedll;

        // Compare nodes from both lists and attach smaller one first
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Add remaining nodes from first list
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // Add remaining nodes from second list
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedll.next; // return the head of merged list
    }

    // Merge sort for linked list:
    // 1. Split list into two halves
    // 2. Sort each half recursively
    // 3. Merge the sorted halves
    public static node mergeSort(node head) {
        if (head == null || head.next == null) {
            return head; // already sorted or empty list
        }

        node mid = getmid(head);
        node lefthead = head;
        node righthead = mid.next;
        mid.next = null; // break the list into two halves

        node newleft = mergeSort(lefthead);
        node newright = mergeSort(righthead);

        return merge(newleft, newright);
    }

    public static void main(String[] args) {
        // Create a sample linked list: 5 -> 3 -> 8 -> 1 -> 7
        head = new node(5);
        head.next = new node(3);
        head.next.next = new node(8);
        head.next.next.next = new node(1);
        head.next.next.next.next = new node(7);

        // Sort the list using merge sort
        head = mergeSort(head);

        // Print the sorted linked list
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
