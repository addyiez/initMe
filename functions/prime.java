package functions;
public class prime {

     /*
     public static boolean isPrime(int n){   
     boolean isPrime=true;
        for(int i=2; i<=n-1;i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;

        //OR

        */
        //corner cases
        
        public static boolean isPrime(int n){

            //1

            if (n==2){
                return true;
            }

            //2

            for(int i=2; i<=n-1; i++){ 
            
                //optimized

            //for(int i=2; i<=Math.sqrt(n); i++){
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
