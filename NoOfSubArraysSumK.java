public class NoOfSubArraysSumK {
    public static int brute(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k) count++;
                else if(sum>k) break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        System.out.println(brute(arr, k));
    }
}
