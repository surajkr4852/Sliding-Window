// Find the maximum element in window of size k.

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static int[] brute(int arr[],int k){
        int temp[]=new int[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++){
            int max=arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]>max) max=arr[j];
            }
            temp[i]=max;
        }
        return temp;
    }

    public static void betterSolution(int arr[],int k){
        int i=0;
        int j=0;
        
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
        System.out.println(Arrays.toString(brute(arr,3)));

    }
}
