package pattern;

public class hollowRec {
    public static void hollow_rectangle(int row, int col){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j=1; j<=col; j++){
                //cell(i,j)
                if(i==1||i==row||j==1||j==col){
                    //boundary cell
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
    
}
