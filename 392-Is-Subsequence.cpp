class Solution {
public:
    bool isSubsequence(string s, string t) {
        int n=t.length();
        int m=s.length();
        int i=0,j=0;
        while(i<m && j<n){
            if(s[i]==t[j]){
                i++;
                j++;
                
            }
            else{
                j++;
            }
        }
return i==s.length();
    }
};