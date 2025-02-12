class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<grid.length;j++){
                if(grid[j][i]<=grid[j-1][i]) {
                c+=grid[j-1][i]+1-grid[j][i];
                grid[j][i]=grid[j-1][i]+1;
                }
            }
        }return c;
    }
}