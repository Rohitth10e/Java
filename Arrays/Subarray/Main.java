public class Main{

    public static int bruteForceSubarray(int arr[]){
        int i,j,k,n=arr.length,sum=0;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int currSum=0;
                for(k=i;k<j;k++){
                    currSum+=arr[k];
                    sum=Math.max(sum, currSum);
                }
            }
        }
        return sum;
    }

    public static int betterSubArray(int arr[]){
        int i,j,n=arr.length,sum=0;
        int prefix[]=new int[n];
        prefix[0]=arr[0];

        for(i=1;i<prefix.length;i++)
            prefix[i]=prefix[i-1]+arr[i];

        for(i=0;i<n;i++){
            int currSum=0;
            for(j=i;j<n;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                sum=Math.max(currSum,sum);
            }
        }
        return sum;
    }

    public static int kadaneAlgorithm(int arr[]){
        int i,j,maxSum=0,n=arr.length,currSum=0;
        for(i=0;i<n;i++){

            currSum+=arr[i];

            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int newArr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(bruteForceSubarray(newArr));
        System.out.println(betterSubArray(newArr));
        System.out.println(kadaneAlgorithm(newArr));
    }
}