class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            set.add(s.substring(i, i + 2));
        }
        for (int i = 0; i < rev.length()-1; i++) {
            if (set.contains(rev.substring(i, i + 2))) {
                return true;
            }
        }
        return false;

    }
}