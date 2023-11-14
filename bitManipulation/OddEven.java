package bitManipulation;

public class OddEven {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("number is even: "+n);
        }
        else{
            System.out.println("number is odd: "+n);
        }
    }
    public static void main(String[] args) {
        oddOrEven(8);
        oddOrEven(3);
    }
    
}
