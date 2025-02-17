class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean red[]=new boolean[n];
        boolean wed[]=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    red[i]=true;
                    wed[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(red[i]||wed[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}