package Queue;
import java.util.*;

public class DoubleEndedQueue {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first element = "+deque.getFirst());
        System.out.println("first element = "+deque.getLast());
    }
}
