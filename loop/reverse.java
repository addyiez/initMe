package loop;

import java.util.*;
/*
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        System.out.print("reverse: ");
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit +"");
            n/=10; //n=n/10;
        }
        System.out.println();
        sc.close();
        
    }
    
}
*/
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n/=10;
        }
        System.out.print("reverse: "+rev);
        sc.close();
        
    }
    
}