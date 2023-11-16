package OOPs;

public class accessModifier {

    public static void main(String args[]){
        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "adityadeopaul";
        myAcc.setPassword("abcdefghi");

    }
    
}  
class Bankaccount{
        public String username;
    /*  private  */ String password;
        
        public void setPassword(String pwd){
            password = pwd;
        }
    }
