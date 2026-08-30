public class mergell {

    public static class node {
        int data ;
        node next;
        public node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;


    private static node getmid(node head){
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static node merge(node head1, node head2) {
        node mergedll = new node(-1);
        node temp = mergedll;

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

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedll.next;
    }

    public static node mergeSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node mid = getmid(head);
        node lefthead = head;
        node righthead = mid.next;
        mid.next = null;

        node newleft = mergeSort(lefthead);
        node newright = mergeSort(righthead);

        return merge(newleft, newright);
    }

    public static void main(String[] args) {
        head = new node(5);
        head.next = new node(3);
        head.next.next = new node(8);
        head.next.next.next = new node(1);
        head.next.next.next.next = new node(7);

        head = mergeSort(head);

        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}
