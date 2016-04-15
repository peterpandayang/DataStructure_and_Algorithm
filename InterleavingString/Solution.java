package InterleavingString;

/**
 * Created by bingkunyang on 16/2/12.
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        int len1 = s1.length(), len2 = s2.length();
        boolean[][] result = new boolean[len1 + 1][len2 + 1];
        result[0][0] = true;

        for (int i = 1; i <= len1; i++) {
            if (s1.charAt(i - 1) == s3.charAt(i - 1) && result[i - 1][0]) {
                result[i][0] = true;
            }
        }

        for (int i = 1; i <= len2; i++) {
            if (s2.charAt(i - 1) == s3.charAt(i - 1) && result[0][i - 1]) {
                result[0][i] = true;
            }
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if ((s1.charAt(i - 1) == s3.charAt(i + j - 1) && result[i - 1][j]) || (s2.charAt(j - 1) == s3.charAt(i + j - 1) && result[i][j - 1]== true)) {
                    result[i][j] = true;
                }

            }
        }
        return result[len1][len2];
    }
}
