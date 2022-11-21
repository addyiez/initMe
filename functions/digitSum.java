package functions;
import java.util.*;

public class digitSum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("input an integer: ");
        int digits= sc.nextInt();
        System.out.println("The sum is "+sumDigits(digits));
        sc.close();
    }
    public static int sumDigits(int n){
        int sumdigit=0;
        while(n>0){
            int lastdigit=n%10;
            sumdigit+=lastdigit;
            n/=10;
        }
        return sumdigit;
    }
    
}
