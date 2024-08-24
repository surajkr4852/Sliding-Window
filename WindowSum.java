public class WindowSum {
    public static int optimal(int arr[],int size){
        int windowSum=0;
        int maxSum=0;
        int j=0;
        int i=0;
        for(i=0;i<size;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        while (i<arr.length) {
            windowSum+=arr[i]-arr[j];
            if(windowSum>maxSum) maxSum=windowSum;
            j++;
            i++;
        }
        return maxSum;
    }
    public static int brute(int arr[],int size){
        int maxSum=0;
        for(int i=0;i<arr.length-2;i++){
            int windowSum=0;
            for(int j=i;j<i+size;j++){
                windowSum+=arr[j];
            }
            if(windowSum>maxSum) maxSum=windowSum;
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        int windowSize=3;
        System.out.println(brute(arr, windowSize));
        System.out.println(optimal(arr, windowSize));
        
    }
}
