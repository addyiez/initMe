//import java.io.InputStream;
import java.util.Scanner;

public class AOC {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        double area=3.14*r*r; //or float area=3.14f*r*r;
        System.out.println(area);
        sc.close();
    }

   /*  private static Scanner newScanner(InputStream in) {
        return null;
    }*/
}
