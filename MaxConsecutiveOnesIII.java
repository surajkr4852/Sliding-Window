// Longest subarray with atmost k zeros
public class MaxConsecutiveOnesIII {
    public static int brute(int arr[],int k){
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int flip=k;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    if(flip>0){
                        flip--;
                        maxLen=Math.max(j-i+1,maxLen);
                    }
                    else{
                        break;
                    }
                }else{
                    maxLen=Math.max(j-i+1,maxLen);
                }
            }
        }
        return maxLen;
    }
    public static int maxConsecutiveIII(int arr[],int k){
        int i=0;
        int j=0;
        int maxLen=0;
        int zeros=0;
        while(j<arr.length){
            if(arr[j]==0) zeros++;
            while(zeros>k){
                if(arr[i]==0){
                    zeros--;
                }
                i++;
            }
            if(zeros<=k){
                maxLen=Math.max(maxLen,j-i+1);
            }
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(brute(arr, k));
    }
}
