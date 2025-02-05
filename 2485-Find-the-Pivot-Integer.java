class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return n;
        }
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            
        }
        for(int i=0;i<=n;i++){
            if(sum/i==i){
                return i;
            }
        }
        return -1;

    }
}