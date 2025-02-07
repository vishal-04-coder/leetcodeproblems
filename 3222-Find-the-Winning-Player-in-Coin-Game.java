class Solution {
    public String winningPlayer(int x, int y) {
        int turn = Math.min(x,y/4);
        int c=0;
        String s;
        while(x>0 && y>=4){
            c++;
            x=x-1;
            y=y-4;
        }
        if(c%2==1){
            s="Alice";
        }
        else{
            s="Bob";
        }
        return s;
    }
}