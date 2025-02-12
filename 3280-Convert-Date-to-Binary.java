class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");

        int num = Integer.parseInt(arr[0]);
        int mon = Integer.parseInt(arr[1]);
        int dat = Integer.parseInt(arr[2]);
        String y = Integer.toBinaryString(num) + "-" + Integer.toBinaryString(mon) + "-" + Integer.toBinaryString(dat);
        return y;

    }
}