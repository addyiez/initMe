package functions;

public class multiplication {
    public static int multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        int a=3;
        int b=5;
        int product=multiply(a,b);
        System.out.println("a * b :"+product);

        //OR

        product = multiply(10,20);
        System.out.println("a * b :"+product);
    }
    
}
