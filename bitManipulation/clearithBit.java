package bitManipulation;

public class clearithBit {
    public static int ClearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(ClearBit(10, 1));
    }
    
}
