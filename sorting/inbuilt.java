package sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]= {5, 4, 1, 3, 2};
        //ascending sort
        Arrays.sort(arr, 0, 5);
        //or Arrays.sort(arr);
        printArr(arr);
        //descending sort
        Arrays.sort(arr, Collections.reverseOrder());
        // OR Arrays.sort(arr, si, ei, Collections.reverseOrder());
        //si = starting index, ei = ending index
        printArr(arr);
    }
}
