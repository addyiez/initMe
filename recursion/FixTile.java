package recursion;

public class FixTile { //amazon
    public static int TilingProblem(int n){ // 2 x N (floor size)
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int fnm1 = TilingProblem(n-1);

        // horizontal choice
        int fnm2 = TilingProblem(n-2);
        
        int Totways = fnm1 + fnm2;
        return Totways;
    }
    public static void main(String args[]){
        System.out.println(TilingProblem(2));
        System.out.println(TilingProblem(3));
        System.out.println(TilingProblem(4));
    }
}
