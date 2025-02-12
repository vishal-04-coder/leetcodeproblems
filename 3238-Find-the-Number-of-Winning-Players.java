class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int s=pick.length;
        int c=0;
        int [][]arr=new int[n][11];
        for(int i=0;i<s;i++){
            int p=pick[i][0];
            int b=pick[i][1];
            arr[p][b]++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<11;j++){
                if(arr[i][j]>i){
                    c++;
                    break;
                    
                }
            }
        }
        return c;
    }
}