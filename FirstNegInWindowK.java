import java.util.ArrayList;
public class FirstNegInWindowK {
    public static void optimal(int arr[],int k){
        
    }
    public static ArrayList<Integer> brute(int arr[],int size){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=arr.length-size;i++){
            int flag=0;
            for(int j=i;j<i+size;j++){
                if(arr[j]<0){
                    flag=arr[j];
                    break;
                }
            }
            list.add(flag);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
        int windowSize=3;
        System.out.println(brute(arr, windowSize));

    }
}
