package functions;

public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
        f=f*i; //f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        
        int n=4;
        int factor= fact(n);
        System.out.println(factor);

        //OR

        System.out.println(fact(5));
    }
    
}
