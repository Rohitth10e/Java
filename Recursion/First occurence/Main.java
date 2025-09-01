public class Main {

    public static int firstOcc(int arr[],int key,int i){
        if(arr[i]==key) return i;
        if(i==arr.length) return -1;

        return firstOcc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,5,2,3,1,6,1,0};
        System.out.println(firstOcc(arr, 1, 0));
    }
}
