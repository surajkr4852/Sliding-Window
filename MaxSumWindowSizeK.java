public class MaxSumWindowSizeK {
    public static int maxSumOfAnyWindowOfSizeK(int arr[],int k){
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        }
        int j=0;
        int maxSum=currSum;
        for(int i=k;i<arr.length;i++){
            currSum+=arr[i]-arr[j];
            maxSum=Math.max(maxSum, currSum);
            j++;
        }
        return maxSum;
    }
    public static int brute(int arr[],int k){
        int maxSum=0;
        for(int i=0;i<=arr.length-k;i++){
            int currSum=0;
            for(int j=i;j<i+k;j++){
                currSum+=arr[j];
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,3,4,5,-1};
        int k=4;
        System.out.println(maxSumOfAnyWindowOfSizeK(arr, k));
    }
}
