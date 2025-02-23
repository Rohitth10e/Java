public class Main{


    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei)
            return;
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int pvt=arr[ei];

        for(int j=si;j<ei;j++){
            if(arr[j]<=pvt){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;

        return i;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}