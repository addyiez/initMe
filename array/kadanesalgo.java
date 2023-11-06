package array;

public class kadanesalgo {
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<numbers.length; i++){
            cs+= numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("maximum sum of subarray = "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
    
}
