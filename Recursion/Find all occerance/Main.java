import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void fn(int arr[],int key, int i,ArrayList<Integer>idx){
        if(arr.length==i)
            return;
        
        if(arr[i]==key){
            idx.add(i);
        }

        fn(arr, key, i+1,idx);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        ArrayList<Integer> idx=new ArrayList<>();
        fn(arr, 2, 0,idx);
        System.out.println(idx);
    }    
}
