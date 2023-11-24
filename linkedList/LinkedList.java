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
    public static int size;

    public void addFirst(int data){
        //step1 -> create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 -> newNode next = head
        newNode.next = head; //link

        //step3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){// insert data in middle of LinkedList
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev :i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
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
    //Search  key via iteration
    public static int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    // reverse linked list
    public void reverse(){ // O(n)
        Node prev = null;
        Node curr = tail = head; // java read assignment from right to left
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
       // ll.print();
        ll.addFirst(2);
       // ll.print();
        ll.addFirst(1);
       // ll.print();
        ll.addLast(4);
       // ll.print();
        ll.addLast(5);
       // ll.print();

        ll.add(2, 3);
        ll.print(); // 1->2->9->3->4

         //System.out.println(ll.size);
        //The static field LinkedList.size should be accessed in a static way
        //System.out.println(LinkedList.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(LinkedList.size);

        // System.out.println(itrSearch(3));
        // System.out.println(itrSearch(10));

    //     System.out.println(ll.recSearch(9));
    //     System.out.println(ll.recSearch(10));

        ll.reverse();
        ll.print();
     }
}
   

