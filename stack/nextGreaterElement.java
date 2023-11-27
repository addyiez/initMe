package stack;
import java.util.*;

public class nextGreaterElement {
    public static void main(String args[]){ //O(n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1) while loop
            while(! s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2) if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //3) push in Stack
            s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
//next greater left
//for(int i=0; i<=arr.length-1; i++)

//next smaller right
//while(! s.isEmpty() && arr[s.peek()] >= arr[i]){}

    //next smaller left
    // for(int i=0; 1<=arr.length-1; i++){
    //while(! s.isEmpty() && arr[s.peek()] >= arr[i]){}
