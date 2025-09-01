public class Main{
    public static void printNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}