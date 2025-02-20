class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                c++;
                i++;
                j++;
            }
            else{
                j++;
            }
           
        }
         return c;
    }
}