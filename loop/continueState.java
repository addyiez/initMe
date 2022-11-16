package loop;

public class continueState {
    public static void main(String args[]){

       for(int i=1; i<=5; i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
       }
       
    }
    
}/*
import java.util.*;
public class continueState {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
     do{
        System.out.println("enter numbers: ");
        int n=sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.print("number: "+n);  
     }while(true);
     
    }
    
}
*/