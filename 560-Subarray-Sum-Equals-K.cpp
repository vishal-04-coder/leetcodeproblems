class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        
        int cnt=0;
        int j=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                if(s==k){
                    cnt++;
                }
            }
            

        }
        return cnt;
    }
};