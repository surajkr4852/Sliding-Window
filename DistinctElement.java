// Count the number of  distinct elements in every window of size K.
import java.util.Arrays;
import java.util.HashMap;
public class DistinctElement {
    public static int[] brute(int arr[],int k){
        int ans[]=new int[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<i+k;j++){
                map.put(arr[j],j);
            }
            ans[i]=map.size();
        }
        return ans;
    }
    public static int[] better(int arr[],int k){
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(j=0;j<k;j++){
            map.put(arr[j],j);
        }
        int answer[]=new int[arr.length-k+1];
        answer[i]=map.size();
        while(j<arr.length){
            if (map.get(arr[i]) == i) {
                map.remove(arr[i]);
            }
            map.put(arr[j],j);
            answer[i+1]=map.size();
            i++;
            j++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,1,1,3};
        int k=3;
        //output=>[2,3,3,2,2];
        System.out.println(Arrays.toString(brute(arr, k)));

        System.out.println(Arrays.toString(better(arr, k)));
        
    }
}
