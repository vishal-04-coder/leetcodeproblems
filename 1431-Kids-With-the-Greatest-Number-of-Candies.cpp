class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int n=candies.size();
        int maxi=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>maxi){
                maxi=candies[i];
            }}
        vector<bool>result(n);
       
       for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=maxi){
                result[i]= true;
            }
            else{
                result[i]= false;
            }

        }
        return result;
    }
};