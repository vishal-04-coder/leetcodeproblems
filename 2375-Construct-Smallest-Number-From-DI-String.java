class Solution {
    public String smallestNumber(String pattern) {
        int top = 0;
        int arr[] = new int[10];
        int n = pattern.length();
        StringBuilder res = new StringBuilder();
        arr[0] = 1;
        for (int i = 0; i < n; i++) {
            if (pattern.charAt(i) == 'I') {
                while (top >= 0) {
                    res.append(arr[top--]);

                }
            }
                arr[++top] = i + 2;
            
        }
        while (top >= 0) {
            res.append(arr[top--]);
        }

        return res.toString();
    }
}