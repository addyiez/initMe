package functions;

public class evenOdd {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
            
        }
        return false;
        
    }
    public static void main(String args[]){
        System.out.println(isEven(4));
    }
    
}
/*
public class evenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter an integer: ");
    num = sc.nextInt();
    if(isEven(num)) {
    System.out.println("Number is even");
    } else {
    System.out.println("Number is odd");
    
    }
    }
    public static boolean isEven(int number) {
    if(number % 2 == 0) {
    return true;
    }
    else {
    return false;
    }
    }
    }
*/