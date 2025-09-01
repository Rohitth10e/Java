public class Main {

    public static void printNumber(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.err.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        printNumber(5);
    }    
}
