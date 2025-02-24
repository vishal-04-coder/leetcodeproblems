class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            String df = "";
            for (int i = 0; i < s.length() - 1; i++) {
                int w = (s.charAt(i)-'0' + s.charAt(i+1)-'0') % 10;
                df += Integer.toString(w);
                
            }
            s=df;
        }
        return s.charAt(0) == s.charAt(1);
    }
}