class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string , vector<string>>ans;
        vector<vector<string>>mp;
        int n=strs.size();
        for(int i=0;i<n;i++){
            string k=strs[i];
            sort(strs[i].begin(),strs[i].end());
            ans[strs[i]].push_back(k);
        }
        for(auto i:ans){

            mp.push_back(i.second);
        }
        return mp;
    }
};