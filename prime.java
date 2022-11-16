

import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }
            else {
                System.out.println("number is not prime");
            }
        }
        sc.close();
     /*  
     Trying something
      for(int i=2 ; i<=n ; i++){
            if(n%i==0){
                System.out.println("number is not prime: "+n);

            }
        }*/
    }
}
