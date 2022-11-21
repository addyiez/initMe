package functions;

public class primeRange {
   
     public static boolean isPrime(int n){

         if (n==2){
            return true;
            }

            for(int i=2; i<=Math.sqrt(n); i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(i+" "); //true
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        PrimeInRange(16);
    }
    
}
