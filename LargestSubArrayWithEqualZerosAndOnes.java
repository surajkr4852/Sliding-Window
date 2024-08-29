//Find the largest Subarray with equal no of Zeros And Ones.
// After replacing all the zeros with 1's , the question becomes find the
// largest subarray with Sum=0; \

import java.util.HashMap;
public class LargestSubArrayWithEqualZerosAndOnes {
    public static void largestSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i]=-1;
        }
        int prefix=0;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==0){
                left=Math.min(left,0);
                right=Math.max(right, i);
            }
            if(map.containsKey(prefix)){
                left=Math.min(left,map.get(prefix)+1);
                right=Math.max(right, i);
            }else{
                map.put(prefix,i);
            }
        }
        System.out.println("Left inded: "+left+" "+"Right Index: "+right);
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,0,0};
        largestSubArray(arr);
    }
}
