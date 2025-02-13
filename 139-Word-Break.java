class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for( String w:wordDict){
                int str=i-w.length();
                if(str>=0 && dp[str] && s.substring(str,i).equals(w)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}