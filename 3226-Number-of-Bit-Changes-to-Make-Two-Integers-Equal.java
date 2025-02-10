class Solution {
    public int minChanges(int n, int k) {
        if(n==k){
            return 0;
        }
        if((n&k)!=k){
            return -1;
        }
        int c=0;
        
        String b=Integer.toBinaryString(n);
        String bin=Integer.toBinaryString(k);
        int maxi=Math.max(b.length(),bin.length());
        while(b.length()<maxi){
            b="0"+b;
        }
        while(bin.length()<maxi){
            bin="0"+bin;
        }
        for(int i=0;i<maxi;i++){
            if(b.charAt(i)!=bin.charAt(i)){
                c++;
            }
          
        }
        return c;
    }
}