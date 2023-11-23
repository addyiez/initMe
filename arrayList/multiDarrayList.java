package arrayList;
import java.util.*;

public class multiDarrayList {
    public static void main(String args[]){
        //BASIC
       /* ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainlist.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list2);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);  */

        //CALCULATION
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=10; i++){
            list1.add(i*1); //mutiple of 1
            list2.add(i*2); //multiple of 2
            list3.add(i*3); //multiple of 3
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        //nested loops
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
