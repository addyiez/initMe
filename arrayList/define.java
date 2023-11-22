package arrayList;
import java.util.ArrayList;

//or
//import java.util.*;

public class define {
    public static void main(String args[]){
        //java Collection framework
        ArrayList<Integer>list = new ArrayList<>();
        // ArrayList<String>list1 = new ArrayList<>();
        // ArrayList<Boolean>list2 = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // size
        System.out.println("Size of array: "+list.size());

        //print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }System.out.println();

        //reverse of list
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }System.out.println();

        //insert element
        list.add(1, 9);
        
        //print full list
        System.out.println(list);

        //get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove - mO(n)
        list.remove(2);
        System.out.println(list);

        //set - O(n)
        list.set(2, 10);
        System.out.println(list);

        //contains - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
    
}
