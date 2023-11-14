package strings;
import java.util.*;

public class basic {
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
      // character array
      // char arr[]= {'a', 'b', 'c', 'd'};

      // string representation1
      // String str = "abcd";
      
      // string representation2 
      // String str2 = new String ("xyz");

        // strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        //count length
        String fullname = "aditya deo";
        System.out.println(fullname.length());

        //concatenation (adding two strings)
        String firstname ="aditya";
        String lastname = "deo";
        String Fullname = firstname + " " + lastname;
        System.out.println(Fullname + " is this.");

        //print any index letter
        System.out.println(Fullname.charAt(1));
        printletters(Fullname);
        
        sc.close();
    }
    
}
