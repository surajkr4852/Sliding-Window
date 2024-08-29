//Find the subarray with given sum. return the start and the end index as an array.

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWIthGivenSum {
    public static int[] subArrayWithGivenSum(int arr[],HashMap<Integer,Integer> map,int sum){
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum==sum){
                return new int[]{0,i};
            }
            if(map.containsKey(currSum-sum)){
                return new int[]{map.get(currSum-sum)+1,i};
            }else{
                map.put(currSum,i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={10,25,-5,15,-10,5};
        int ans[]=subArrayWithGivenSum(arr, map, 5);
        System.out.println(Arrays.toString(ans));

    }
}
