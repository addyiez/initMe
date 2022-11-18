package functions;

import java.util.*;

public class sum {
   /* 
   
   PROCESS 1:

   public static void calculateSum(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a= ");
        int a=sc.nextInt();
        System.out.print("enter b= ");
        int b=sc.nextInt();
        int sum=a + b;
        System.out.println("sum= "+sum);
        sc.close();
    }
    public static void main(String args[]){
        calculateSum();      //function call
    }
    
    PROCESS 2:

     public static void calculateSum(int a, int b){
        
        int sum=a + b;
        System.out.println("sum= "+sum);
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a= ");
        int a=sc.nextInt();
        System.out.print("enter b= ");
        int b=sc.nextInt();
        calculateSum(a,b);
        sc.close();
    }*/

    //PROCESS 3:

    public static int calculateSum(int a, int b){
        
        int sum=a + b;
       return sum;
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a= ");
        int a=sc.nextInt();
        System.out.print("enter b= ");
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("sum= "+sum);
        sc.close();
    }
     
}
