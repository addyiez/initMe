package loop;

import java.util.*;
public class naturalsum {
    
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n=sc.nextInt();
            int i=1;
            int sum=0;
            System.out.print("First " + n + " Numbers = " );
            while(i<=n){
                
                System.out.print(i+" ");
                
                sum=sum+i; //sum+=i;
                i++;
                
                
            }
            System.out.println();
            System.out.println("sum of First "+n+ " Natural number is = "+sum);
            sc.close();
        }
    }/*
    public static void main(String[] args)
    {
        int N = 5;
        System.out.print("First " + N + " Numbers = ");
 
        // we initialize the value of the variable i
        // with 1 and increment each time with 1
        for (int i = 1; i <= N; i++) {
           
            // print the value of the variable as
            // long as the code executes
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum of first " + N
                           + " Natural Number = " + (N*(N+1))/2);
    }
}
    */
    

