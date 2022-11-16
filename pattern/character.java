package pattern;

import java.util.*;
public class character{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of lines: ");
        int n=sc.nextInt();
        char ch='A';
        for(int line=1; line<=n; line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
