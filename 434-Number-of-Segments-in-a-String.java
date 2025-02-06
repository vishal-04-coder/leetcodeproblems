class Solution {
    public int countSegments(String s) {
        String []str=new String[1000];
        str=s.trim().split("\\s+");
        return s.trim().isEmpty()?0:str.length;
    }
}