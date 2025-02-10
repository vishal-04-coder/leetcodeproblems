class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n=energyDrinkA.length;
        long[][] dp=new long[n+6][2];
        for(int i=n-1;i>=0;i--){
            dp[i][0]=Math.max(energyDrinkB[i]+dp[i+1][0],dp[i+1][1]);
            dp[i][1]=Math.max(energyDrinkA[i]+dp[i+1][1],dp[i+1][0]);
        }
        return Math.max(dp[0][0],dp[0][1]);
    }
}