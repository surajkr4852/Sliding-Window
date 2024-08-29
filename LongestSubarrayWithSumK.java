import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int better(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int currSum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum==k) maxLen=Math.max(maxLen,i+1);
            if(map.containsKey(currSum-k)){
                maxLen=Math.max(maxLen,i-map.get(currSum-k));
            }
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
        }
        return maxLen;
    }
    public static int optimal(int arr[],int k){
        int l=0;
        int r=0;
        int sum=0;
        int maxLen=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
    public static int brute(int arr[],int k){
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=i;j<arr.length;j++){
                currSum+=arr[j];
                if(currSum==k) maxLen=Math.max(maxLen,j-i+1);
                else if(currSum>k) break;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        System.out.println(brute(arr, 3));
        System.out.println(optimal(arr, 3));
        System.out.println(better(arr, 3));
    }
}