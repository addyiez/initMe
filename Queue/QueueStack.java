package Queue;
import java.util.*;

public class QueueStack {
    static class QueueS{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                ;System.out.println("queue empty");
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                ;System.out.println("queue empty");
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        //QueueS q = new QueueS();
        QueueS.add(1); //q.add()
        QueueS.add(2); //q.add()
        QueueS.add(3); //q.add()
        
        while(!QueueS.isEmpty()){ //q.add()
            System.out.println(QueueS.peek()); //q.peek()
            QueueS.remove(); //q.remove()
        }
    }
}
