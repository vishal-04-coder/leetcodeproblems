class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String res="";
        int maxi=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++){
             s[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        if(s[0].equals("0")){
            return "0";
        }
        return String.join("",s);

        // for(int i=0;i<s.length;i++){
        //     if(s[i]+s[i+1]>s[i+1]+s[i]){
        //         res[i]=s[i];
        //     }
        //     else{
        //         res[i]=s[i+1];
        // //     }
        //     int ans=Integer.parseInt(res);
        //     maxi=Math.max(maxi,ans);
        // }
        // return maxi;
    }
}