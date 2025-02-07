class Solution {
    public int minimumChairs(String s) {
        int people=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                people++;
            }
            if(s.charAt(i)=='L'){
                people--;
            }
            maxi=Math.max(maxi,people);
        }
        
        return maxi;
    }
}