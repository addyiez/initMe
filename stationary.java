import java.util.*;
public class stationary {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         float pencil=sc.nextFloat();
         float pen=sc.nextFloat();
         float eraser=sc.nextFloat();
         float bill= pencil+pen+eraser;
         float tax=bill*0.18f; //include 18%gst
         float tbill=bill+tax;
         System.out.println("price of pencil: "+pencil);
         System.out.println("price of pen: "+pen);
         System.out.println("price of eraser: "+eraser);
         System.out.println("bill= "+bill);
         System.out.println("tax= "+tax);
         System.out.println("total bill= "+tbill);
         sc.close();

    }
    
}
