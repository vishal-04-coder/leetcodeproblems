class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int m=nums[i];
            int s=0;
            while(m>0){
                s+=(m%10);
                m=m/10;
                
            }
            mini=Math.min(mini,s);
        }
        return mini;
        
    }
}