package array;

public class subarray {
    public static void printSub(int numbers[]) {
        int ts=0;
        for(int i=0; i<numbers.length; i++){ //start=i
            for(int j=i; j<numbers.length; j++){ //end=j
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }System.out.println();
        }System.out.println("total subarrays = " + ts);
    }
    public static void main(String args[]){
        int numbers[]={2, 4, 6, 8, 10};
        printSub(numbers);
    }
}
