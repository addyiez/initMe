package backtracking;

public class GridWays { // O(2^n+m) - TC
    public static int GW(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){ //condition for last cell
            return 1;
        }else if(i == n || j == n){ //boundary class condition
            return 0;
        }

        int w1 = GW(i+1, j, n, m);
        int w2 = GW(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println(GW(0, 0, n, m));
    }
    
}
