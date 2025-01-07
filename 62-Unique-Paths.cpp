class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<int>a(n,1);
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                a[j]=a[j-1]+a[j];
            }
        }
        return a[n-1];
    }
};