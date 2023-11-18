package recursion;

public class friendsPairing {
    public static int pairCount(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = pairCount(n-1);
        //pair
        int fnm2 = pairCount(n-2);
        int pairWays = (n-1) * fnm2;
        //total ways
        int totWays = fnm1 + pairWays;
        return totWays;

        //single line statement
        // return pairCount(n-1) + (n-1)*pairCount(n-2);
    }
    public static void main(String args[]){
        System.out.println(pairCount(3));
    }
}
