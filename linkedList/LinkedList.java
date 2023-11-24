package linkedList;
public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 -> newNode next = head
        newNode.next = head; //link

        //step3 -> head = newNode
        head = newNode;
    }
    public void print(){ //O(n)
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head; //using temp because we cant change head
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        

    }
}
   

