package functions;

public class swap {
    public static void change(int a, int b){
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swap values: "+a);
        System.out.println("swap values: "+b);
    } 
    public static void main(String args[]){
        int a=5;
        int b=10;
        change(a,b);
    }
    
}
