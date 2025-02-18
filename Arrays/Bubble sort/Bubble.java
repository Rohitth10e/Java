public class Bubble{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count+=1;
                }
            }
            if(count==0) break;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        bubbleSort(arr);
    }
}