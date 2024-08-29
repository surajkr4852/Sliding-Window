// Find the longest length of Subarray with Sum <= K
public class LongestSubArray {
    public static int brute(int arr[],int k){
        int longestSum=0;
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=i;j<arr.length;j++){
                currSum+=arr[j];
                if(currSum>=k) break;
                if(currSum>longestSum){
                    longestSum=currSum;
                }
            }
        }
        return longestSum;
    }
    public static int better(int arr[],int k){      //O(2N)
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

    public static int betterPractice(int arr[],int k){
        int l=0,r=0,maxlen=0,currSum=0;
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
    public static void betterPractice2(int arr[],int k){
        int l=0;
        int r=0;
        int sum=0;
        int len=0;
        int maxLen=0;
        while(r<arr.length){
            sum+=arr[r];
            while (sum>k) {
                sum-=arr[l];
                l++;
            }
            if(sum<=k) maxLen=Math.max(r-l+1,maxLen);
            r++;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int k=14;
        System.out.println(brute(arr, k));
        System.out.println(better(arr, k));
    }
}
