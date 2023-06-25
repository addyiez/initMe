package functions;
import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;
        while(palindrome>-0){
           int remainder=palindrome%10;
           reverse=reverse*10+remainder;
           palindrome=palindrome/10;
        }
        if (number==reverse){
            return true;
        }
        return false;
    }
 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("number : "+n+ " is a palindrome");
        }
        else{
            System.out.println("number : "+n+ " is not a palindrome");
        }
        sc.close();
    }
}