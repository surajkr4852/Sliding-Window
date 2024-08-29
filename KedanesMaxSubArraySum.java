// Find the maximum sum of any size subarray .
public class KedanesMaxSubArraySum {
    public static int maxSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxSum) maxSum=currSum;
            else if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};

    }
}
