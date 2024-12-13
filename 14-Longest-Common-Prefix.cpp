class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n =strs.size();
        string str="";
        sort(strs.begin(),strs.end());
        string s=strs[0],e=strs[n-1];
        for(int i=0;i<min(s.size(),e.size());i++){
            if(s[i]!=e[i]){
                
                return str;
            }
            str+=s[i];
        }
        return str;
    }

    
};