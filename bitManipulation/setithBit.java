package bitManipulation;

public class setithBit {
    public static int SetIbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
        public static void main(String args[]){
        System.out.println(SetIbit(10, 2));
    }
    
}
