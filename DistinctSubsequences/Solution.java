package DistinctSubsequences;

/**
 * Created by bingkunyang on 16/2/11.
 */
public class Solution {
    public int numDistinct(String S, String T) {
        int[][] dp = new int[S.length() + 1][T.length() + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= S.length(); i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= T.length(); i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        return dp[S.length()][T.length()];
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        String str1 = "rabbbit", str2 = "rabbit";
        System.out.print(test.numDistinct(str1, str2));
    }
}
