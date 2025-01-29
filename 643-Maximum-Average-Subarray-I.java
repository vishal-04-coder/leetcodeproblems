class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg;
        double ans=0;
        double maxi=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        avg=ans/k;
        maxi=Math.max(maxi,avg);

        for(int j=k;j<nums.length;j++){
            ans+=nums[j]-nums[j-k];
            maxi=Math.max(maxi,(double)ans/k);
        }    
        return maxi; 
    }
}