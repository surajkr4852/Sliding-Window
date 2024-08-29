// 1423. Maximum Points You Can Obtain from Cards

public class MaxScoreObtainedFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int profit=0;
        for(int i=0;i<k;i++){
            profit+=cardPoints[i];
        }
        int maxProfit=profit;
        int i=k-1;
        int j=cardPoints.length-1;
        while(i>=0){
            profit-=cardPoints[i];
            profit+=cardPoints[j];
            maxProfit=Math.max(profit,maxProfit);
            i--;
            j--;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int cardPoints[] = {9,7,7,9,7,7,9};
        System.out.println(maxScore(cardPoints, 7));
    }
}
