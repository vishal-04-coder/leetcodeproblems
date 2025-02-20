class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int []arr=new int[n*n];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[l++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==k-1){
                return arr[i];
            }
        }
        return -1;
    }
}