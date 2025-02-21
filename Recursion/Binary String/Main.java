public class Main {
    public static String fn(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!='1' || str.charAt(i)!='1')
                sb.append(str.charAt(i-1));
            }
        return sb.toString();
    }    
    public static void main(String[] args) {
        System.out.println(fn("010011"));
    }
}
