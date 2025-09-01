public class Main {
    public static int fn(int n){
        if(n==1 || n==2)
            return n;
        return fn(n-1) + (n-1) * fn(n-2); 
    }
    public static void main(String[] args) {
        System.out.println(fn(5));
    }
}
