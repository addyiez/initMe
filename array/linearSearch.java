package array;

public class linearSearch {
    public static int linear(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16};
        int key= 8;
        int index = linear(numbers, key);
        if(index==0){
            System.out.println("NOT found");
        }
        else{
            System.out.println("key is at index : "+index);
        }
        
    }
    
}
