class Solution {
    public String removeOccurrences(String s, String part) {
        String str;
       
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}