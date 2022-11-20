package functions;

public class overloading {

    //function to calculate sum of 2 no.s
    public static int sum(int a, int b){
        return a+b;
    }
    //function to calculate sum of 3 no.s
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String args[]){
        System.out.println("sum of 2 no.s= "+sum(3,5));
        System.out.println("sum of 3 no.s= "+sum(3,5,7));
    }
}
