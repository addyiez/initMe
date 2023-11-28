package Queue;

public class linkedListQ {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueL{
        static Node head = null;
        static Node tail = null;
       
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
       
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head){
                tail = head = null;
            } else{
                head = head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        //QueueL q = new QueueL();
        QueueL.add(1); //q.add()
        QueueL.add(2); //q.add()
        QueueL.add(3); //q.add()
        
        while(!QueueL.isEmpty()){ //q.add()
            System.out.println(QueueL.peek()); //q.peek()
            QueueL.remove(); //q.remove()
        }
    }

}
