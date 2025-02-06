class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=nums[i]*nums[j];
                hs.put(p,hs.getOrDefault(p,0)+1);
            }
        }
        for(int fre:hs.values()){
            if(fre>1){
                result+=4*(fre*(fre-1));
            }
        }
        return result;
            
        
        
    }
}