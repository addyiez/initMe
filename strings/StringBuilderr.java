package strings;


public class StringBuilderr {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);  //add strings 
        }
        System.out.println(sb);
    }
    
}
