class Solution {
public:
    bool isIsomorphic(string s, string t) {
        vector<int> str(200,0);
        vector<int> ttr(200,0);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(str[s[i]]!=ttr[t[i]]){
                return false;
            }
            str[s[i]]=i+1;
            ttr[t[i]]=i+1;
        }
        return true;
    }
};