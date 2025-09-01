public class Main {
    public static void trappingWater(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];

        leftMax[0] = arr[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }

        for(int i=0;i<leftMax.length;i++){
           System.out.print(leftMax[i]+" "); 
        }
        System.out.println();
        for(int i=0;i<rightMax.length;i++){
            System.out.print(rightMax[i]+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        trappingWater(arr);
    }    
}
