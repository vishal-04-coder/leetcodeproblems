/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        long l = 0;
        long r = n ;
        while (l <= r) {

            int mid = (int)( l + (r - l) / 2);
            int pick = guess(mid);
            if (pick == 0) {
                return mid;
            } else if (pick == -1) {
                r = mid - 1;
            } else {
               l=mid+1;
            }
        }
        return -1;
    }
}