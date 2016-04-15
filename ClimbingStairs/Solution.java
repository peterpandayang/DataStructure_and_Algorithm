package ClimbingStairs;

/**
 * Created by bingkunyang on 16/2/9.
 */
public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int last = 1, lastlast = 1, now = 0;

        for (int i = 2; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.climbStairs(3));
    }
}
