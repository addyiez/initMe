package strings;

public class substring {
    public static String getSubstring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str ="HelloWorld";
         //print
        System.out.println(getSubstring(str, 0, 5));
        
        //inbuit function
        System.out.println(str.substring(0, 4));
        
    }
    
}
