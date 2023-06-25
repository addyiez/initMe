package array;

public class pairs {
    //pairs in an Array
    public static void pair(int numbers[]) {
        int n=numbers.length;
        int total=n*(n-1)/2;
        for(int i=0; i<n; i++){
            int curr= numbers[i];
            for(int j=i+1; j<n; j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }  
            System.out.println(); 
         }
         System.out.println("numbers of pairs are: "+total);
    }
    
    public static void main(String args[]) {
        int numbers[]={2,4,6,8,10};
        pair(numbers);
        
    }
    
}
