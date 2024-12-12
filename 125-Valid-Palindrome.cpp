class Solution {
public:
    bool isPalindrome(string s) {
        string str="";
        int n=s.size();
        for(int i=0;i<n;i++){
            str+=tolower(s[i]);
        }
        string s1="";
        for(int i=0;i<str.size();i++){
            if(str[i]>='a' && str[i]<='z' || str[i]>='0' && str[i]<='9'){
                s1+=str[i];
            }
        }
        string s2="";
        for(int i=s1.size()-1;i>=0;i--){
            s2+=s1[i];
        }
        return s2==s1;
    }
};