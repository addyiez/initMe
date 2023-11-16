package bitManipulation;

public class updateithBit {
    public static int ClearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int SetIbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int UpdateBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return ClearBit(n, i);
        // }
        // else{
        //     return SetIbit(n, i);
        // }

        n=ClearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(UpdateBit(10, 2, 1));
    }
    
}
