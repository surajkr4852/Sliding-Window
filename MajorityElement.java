public class MajorityElement {
    public static int majorityElement (int arr[]) throws Exception{
        int votes=0;
        int candidate=-1;
        int i=0;
        while(i<arr.length){
            if(votes==0){
                candidate=arr[i];
                votes+=1;
            }
            else if(arr[i]==candidate){
                votes+=1;
            }
            else if(arr[i]!=candidate){
                votes-=1;
            }
            i++;
        }
        votes = 0;
        for (int num : arr) {
        if (num == candidate) {
            votes++;
        }
    }

    if (votes > arr.length / 2) {
        return candidate;
    } else {
        throw new IllegalArgumentException("No majority element exists");
    }
    }
    
    public static void main(String[] args) throws Exception{
        int arr[]={2,2,1,1,1,2};
        System.out.println(majorityElement(arr));
    }
}
