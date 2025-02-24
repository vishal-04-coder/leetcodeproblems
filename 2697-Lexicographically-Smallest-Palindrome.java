class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        char []arr=s.toCharArray();
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                char mini=(char)Math.min(arr[i],arr[n-1-i]);;
                arr[i]=mini;
                arr[n-1-i]=mini;
            }
        }
        return new String(arr);
    }
}