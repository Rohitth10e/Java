public class Main {
    public static int fn(String str,int i){
        if(i==str.length()){
            return i;
        }
        return fn(str, i+1);
    }
    public static void main(String[] args) {
        System.out.println(fn("missisipi", 0));
    }    
}
