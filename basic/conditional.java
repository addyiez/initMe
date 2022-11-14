package basic;

import java.util.*;
/*
public class conditional {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int number=sc.nextInt();
        String type= number>=0 ? "positive" : "negative";
        System.out.println(type);
        sc.close();
    }

    
}

public class conditional {
    public static void main(String[] args) {
      //  Scanner sc= new Scanner(System.in);
       // System.out.println("enter you temp:")
    double temp = 103.5;
    String type = temp>100 ? "fever" : "you don't have fever" ;
    System.out.println(type);
    }
    }
    
    public class conditional {
        public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println("enter day of week");
          int number=sc.nextInt();
          switch (number){

            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("day doesn't exist");
          }
        }
    }
       
      public class conditional {
        public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;
        System.out.println(x);
        System.out.println(y);
        }
        }
         
        public class conditional {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.print("enter year:");
                int year=sc.nextInt();
                if((year%4==0) && (year%100==0) && (year%400==0)){
                    System.out.println("its a leap year");
            
                }
                
                else{
                    System.out.println("its not leap year");
                }
                sc.close();
            }
        }
        */
        public class conditional {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the year: ");
            int year = sc.nextInt();
            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 == 0));
            if (x && (y || z)) {
            System.out.println(year + " is a leap year");
            } else {
            System.out.println(year + " is not a leap year");
            sc.close();
            }
            }
            }
            