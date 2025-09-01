public class Main {

    public static boolean checkSortedLoop(int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
                continue;
            return false;
        }
        return true;
    }

    public static boolean iSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]) return false;

        return iSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,4};
        System.out.println(iSorted(arr,0));
    }    
}