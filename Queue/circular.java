package Queue;

public class circular {
    static class QueueC{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        QueueC(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];

            //last element delete 
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        QueueC q = new QueueC(3);
        q.add(1);
        QueueC.add(2);
        QueueC.add(3);
        System.out.println(QueueC.remove());
        QueueC.add(4);
        System.out.println(QueueC.remove());
        QueueC.add(5);

        while(!QueueC.isEmpty()){
            System.out.println(QueueC.peek());
            QueueC.remove();
        }
    }
}
