class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(fer(red,blue),fer(blue,red));
    }
        private int fer(int red,int blue){
        int c=0;
        int i=1;
        while(true){
            if(i%2==0){
                if(red>=i){
                    red-=i;
                }
                else{
                break;
            }
            }
            else{
                if(blue>=i){
                    blue-=i;
                }
                else{
                    break;
                }
            }
            c++;
            i++;
            

        }
        
          return c;
    }
}