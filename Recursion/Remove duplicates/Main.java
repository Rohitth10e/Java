public class Main {
    public static void removeDupliates(String str,int i,StringBuilder s,boolean map[]){
        if(i==str.length()){
            System.out.println(s);
            return;
        }

        if(map[str.charAt(i)-'a']==false){
            map[str.charAt(i)-'a']=true;
            removeDupliates(str, i+1, s.append(str), map);
        }else{
            removeDupliates(str, i+1,s,map);
        }

    }
    public static void main(String[] args) {
        removeDupliates("aappanacollege", 0,new StringBuilder(), new boolean[26]);
    }    
}
