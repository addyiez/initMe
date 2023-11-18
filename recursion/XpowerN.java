package recursion;

public class XpowerN {
    public static int power(int x, int n){ // O(n)
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }
    public static int OptPower(int a, int n){ //optimozed code
        //O(logn)- time complexity
        if(n == 0){
            return 1;
        }
        //int halfPowersq = OptPower(a, n/2) * OptPower(a, n/2);
        int halfPowr = OptPower(a, n/2);
        int halfPowersq = halfPowr * halfPowr;

        // n is Odd
        if(n % 2 != 0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String args[]){
        System.out.println(power(2, 3));
        System.out.println(OptPower(2, 5));
        
    }
    
}
