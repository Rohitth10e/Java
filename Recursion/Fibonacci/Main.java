import java.util.Arrays;

public class Main{

    public static int helper(int n,int memo[]){

        if(n==1 || n==2 ) return 1;

        if(memo[n]!=-1){
            return memo[n];
        }

        memo[n]=helper(n-1,memo) + helper(n-2, memo);
        return memo[n];
    }

    public static int fib(int n){
        if(n==0) return 0;
        int [] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return helper(n, memo);
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
