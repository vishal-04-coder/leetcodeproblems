class Solution {
    public int minPathSum(int[][] grid) {
         int n=grid.length;
        int m=grid[0].length;
        int [][]arr=new int[n][m];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=grid[i][0];
            arr[i][0]=sum;
        }
        int s=0;
        for(int i=0;i<m;i++){
            s+=grid[0][i];
            arr[0][i]=s;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+grid[i][j];
            }
        }
        return arr[n-1][m-1];
    }
}