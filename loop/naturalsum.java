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
    }
    

