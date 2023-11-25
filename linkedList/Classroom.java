package linkedList;
import java.util.LinkedList;
//import java.util.*;

public class Classroom {
    public static void main(String args[]){
//create - (objects only -> int, float, boolean (dont) ->Integer, Float, Character(do))
    LinkedList<Integer> ll = new LinkedList<>();

    //add
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    //0->1->2
        System.out.println(ll);
    //remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
    }
    
}
