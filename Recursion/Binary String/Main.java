public class Main {
    public static String fn(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!='1' || str.charAt(i)!='1')
                sb.append(str.charAt(i-1));
            }
        return sb.toString();
    }
    
    public static void printBin(int n,int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBin(n-1, 0, str+"0");
        if(lastPlace==0){
            printBin(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // System.out.println(fn("010011"));
        printBin(3, 0, "");
    }
}
