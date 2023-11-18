package recursion;

public class removeDuplicates {
    public static void duplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            duplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            duplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
