package Queue;
import java.util.*;

public class JCF {
     public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>(); // or implement with ArrayDeque class
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
