package functions;
public class binomial {
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
        f=f*i; //f*=i;
        }
        return f;
    }
    public static int bi_coff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr = fact(n-r);
        int nCr =fact_n/(fact_r*fact_nr);
        return nCr;
    }
    public static void main(String args[]){
        
        System.out.println(bi_coff(4,2));
    }
    
}
