package pattern;
import java.util.*;
public class pattern {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of lines: ");
        int n=sc.nextInt();
        for(int line=1; line<=n; line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
