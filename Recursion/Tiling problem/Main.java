public class Main {
    public static int tails(int n){
        if(n==0 || n==1 ) return 1;
        if(n==2 || n==3 ) return n;

        return tails(n-1)+tails(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tails(4));
    }    
}
