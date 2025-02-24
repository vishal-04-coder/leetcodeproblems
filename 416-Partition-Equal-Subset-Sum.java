class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        if(total%2!=0) 
        {
         return false;
        }
        int target=total/2;
        boolean dp[]=new boolean[target+1];
        dp[0]=true;
        for(int i=0;i<n;i++){
            for(int j=target;j>=nums[i];j--)
            {
                dp[j]=dp[j]||dp[j-nums[i]];
            }
        }
        return dp[target];

    }
}