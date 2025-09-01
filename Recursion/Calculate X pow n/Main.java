public class Main {

    public static int optimizedPow(int x,int n){
        if(n==0) return 1;
        if(n==1) return x;

        int halfPow=optimizedPow(x, n/2);
        halfPow*=halfPow;

        if(n%2!=0){
            halfPow*=x;
        }

        return halfPow;
    }

    public static int pow(int x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        
        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(optimizedPow(2, 5));
    }    
}
