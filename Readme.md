-Types//Patterns
    -Constant window size
        -Subarray of size k with maximum sum
    -Longest subarray/substring where (condition) // Most asked.
        -// Find the longest Subarray with Sum <= K
    -No of subarrays with some condition.
        -solved using pattern 2
        -no of subarrays with sum=k.
    -Shortest/min window with condition



<!-- 

General Format

public static int optimal(int arr[],int k){
        int l=0;
        int r=0;
        int currSum=0;
        int maxlen=0;
        while(r<arr.length){
            currSum+=arr[r];
            while(currSum>k){
                currSum-=arr[l];
                l++;
            }
            if(currSum<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
 -->