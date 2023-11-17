package recursion;

public class naturalSum {
    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int Sn = n + calSum(n - 1);
        return Sn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(calSum(n));
    }
    
}
