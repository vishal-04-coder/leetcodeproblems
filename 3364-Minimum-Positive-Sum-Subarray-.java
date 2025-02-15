class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int mini=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            if(n<i) {
                break;
            }
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums.get(j);
                //mni=Math.min(mini,sum);
                
            }
            if(sum>0){
                    mini=Math.min(mini,sum);
                }
                for(int k=i;k<n;k++ ){
                    sum-=nums.get(k-i);
                    sum+=nums.get(k);
                    if(sum>0){
                    mini=Math.min(mini,sum);
                }
                }
        }
        
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}