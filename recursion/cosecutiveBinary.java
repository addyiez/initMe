package recursion;

public class cosecutiveBinary { //paytm
    public static void printBinStrings(int n, int lastPlace, String str){
        // if(lastPlace == 0){
        //     //sit 0 on chair
        // use StringBuilder and try to solve this****
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // }else{
        //     printBinStrings(n-1, 0, str.append("0"));
        // }
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        printBinStrings(3, 0, new String(""));
    }
    
}
