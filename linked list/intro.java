public class intro {

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

    // Add node at beginning2    
    public void add_node(int data) {

        node newNode = new node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add node at end
    public void add_last_node(int data) {

        node newNode = new node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Add node at a given index
    public void add_mid(int data, int index) {

        if (index == 0) {
            add_node(data);
            return;
        }

        node newNode = new node(data);
        node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Print linked list
    public void print() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove first node
    public int remove_first() {

        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }

        int value = head.data;

        if (size == 1) {
            head = tail = null;
            size = 0;
            return value;
        }

        head = head.next;
        size--;

        return value;
    }

    // Remove last node
    public int remove_last() {

        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }

        int value = tail.data;

        if (size == 1) {
            head = tail = null;
            size = 0;
            return value;
        }

        node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;

        return value;
    }
    // search in the linked list using ittration 
    public int ittrativesearch(int key){
        node temp = head;
        int i=0;
        while (temp!=null) {
            if (temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Search in the linked list using recursion
    public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }
    


    // reverse a linked list v.v.v.v.important

    public void reverse (){
        node prev=null;
        node current = tail=head;
        node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
        }
        head = prev;
        tail = current;
    }


    // deleat at nth node 
    public void deleatnthfromend(int n){
        if (n <= 0 || head == null) {
            return;
        }

        // calculate size 
        int size =0 ;
        node temp = head;
        while (temp!= null) {
            temp = temp.next;
            size++;
        }
        if (n==size){
            head = head.next;
            this.size--;
            if (head == null) {
                tail = null;
            }
            return;
        }
        if (n > size) {
            return;
        }
        int i= 1;
        int itofind= size-n;
        node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        if (prev.next == null) {
            tail = prev;
        }
        this.size--;
    }

    // slow faste approch  hellper function to check a linked list is pelindrom or not 
    public node findmid (node head){
        node slow=head ;
        node fast = head ;
        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // palindrom 

    public boolean checkpelindrom (){
        if (head!=null || head.next == null){
            return true;
        }
        // find mid

        node midnode = findmid(head);

        // reverse 2nd half 
        node prev = null;
        node current = midnode;
        node next;
          while (current != null) {
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
        }
        node rigth = prev;// right half head
        node left = head ;// left half head
        // check both the half
        while (rigth != null) {
            if (left.data != rigth.data ){
                return false;
            }
            left = left.next;
            rigth = rigth.next;
        }
        return true;
    }
    public static void main(String[] args) {

        intro ll = new intro();

        ll.add_node(1);
        ll.print();

        ll.add_node(2);
        ll.print();

        ll.add_last_node(3);
        ll.print();

        ll.add_last_node(4);
        ll.print();

        ll.add_mid(3, 2);
        ll.print();

        System.out.println("Size = " + size);

        System.out.println("Removed first: " + ll.remove_first());
        ll.print();

        System.out.println("Removed last: " + ll.remove_last());
        ll.print();

        System.out.println("Size = " + size);
        System.out.println(ll.recsearch(3));
        System.out.println(ll.ittrativesearch(3));
        ll.reverse();
        ll.print();
        System.out.println(ll.checkpelindrom());
    }
}