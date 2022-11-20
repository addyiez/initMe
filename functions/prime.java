package functions;

public class prime {

    public static boolean isPrime(int n){
     /*   boolean isPrime=true;
        for(int i=2; i<=n-1;i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;

        //OR

        */
          for(int i=2; i<=n-1;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[]){
        System.out.println(isPrime(5));
    }
    
}
