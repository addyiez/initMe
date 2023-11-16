package bitManipulation;

public class ClearLastiBits {
    public static int ClearLastBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(ClearLastBits(15, 2));
    }
    
}
