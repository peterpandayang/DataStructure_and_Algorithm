package LongestIncreasingSubsequence;

/**
 * Created by bingkunyang on 16/2/13.
 */
public class Solution {
    public int longestIncreasingSubsequence(int[] nums) {
        if (nums.length == 0) return 0;
        int len = nums.length;
        int[] result = new int[len];
        result[0] = 1;
        int maxLen = result[0];
        for (int i = 1; i < len; i++){
            result[i] = 1;
            for (int j = i - 1; j >= 0; j--)
                if (nums[i] >= nums[j] && result[i] < result[j] + 1) {
                    result[i] = result[j] + 1;
                }

            if (maxLen < result[i]) {
                maxLen = result[i];
            }
        }
        return maxLen;
    }
}
