package loop;
import java.util.*;
public class multiplication {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a positive number : ");
        int n=sc.nextInt();
        System.out.println("multiplication table:");
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i +" is: "+n*i);
        } 
        
        sc.close();
    }
    
}
