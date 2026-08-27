public class intro {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public void add_node(int data){
       // s1) create a new node 
       node newNode = new node(data); 
       if (head == null){
        head = tail = newNode;
        return;
       }
       // s2) newnode next = head
       newNode.next= head;
       // head = new head
       head=newNode;
     }
      public void add_last_node(int data){
       // s1) create a new node 
       node newNode = new node(data); 
       if (head == null){
        head = tail = newNode;
        return;
       }
       // s2) newnode next = head
       tail.next= newNode;
       // head = new head
       tail=newNode;
     }
     public void print (){
        if (head == null){
            System.out.println("linked list is empty");
            return;
        }
        node temp = head;
        while (temp != head){
            System.out.println(temp.data+ " ");
            temp= temp.next;
        }System.out.println();
     }
    public static void main(String[] args) {
        intro ll = new intro();
        ll.add_node(1);
        ll.print();
        ll.add_node(2 );
        ll.print();
        ll.add_last_node(3);
        ll.print();
        ll.add_last_node(4 );
        ll.print();
    }
}

