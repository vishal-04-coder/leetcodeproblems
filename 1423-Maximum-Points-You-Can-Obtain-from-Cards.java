class Solution {
    public int maxScore(int[] card, int k) {
        int sum=0;
        int maxi=0;
        int n=card.length;
        for(int i=0;i<k;i++){
            sum+=card[i];
        }
        int curr = sum;
        for(int i=k-1;i>=0;i--){
            curr-=card[i];
            curr+=card[n-k+i];
            sum=Math.max(curr,sum);
        }
        return sum;
    }
}