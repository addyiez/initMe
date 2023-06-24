package array;

public class smallestNumber {
  
   public static int getsmallest(int number[]){
    int smallest= Integer.MAX_VALUE;

    for(int i=0; i<number.length; i++){
        if(smallest>number[i]){
            smallest = number[i];
        }
    }
    return smallest;
   } 

    public static void main(String args[]){
    int number[]={5,6,8,0,3};
    System.out.println("smallest number is :" +getsmallest(number));

   }
}
