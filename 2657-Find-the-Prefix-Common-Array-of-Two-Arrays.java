class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int c=0;
        int fre[]=new int[A.length+1];
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            fre[A[i]]++;
            if(fre[A[i]]==2){
                c++;
            }
            fre[B[i]]++;
            if(fre[B[i]]==2){
                c++;
            }
            res[i]=c;
        }
        return res;
    }
}