package RecoverRotatedSortedArray;

import java.util.*;

/**
 * Created by bingkunyang on 16/1/28.
 */
public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return;
        int checkindex = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                reverse(i + 1, nums.size() - 1, nums);
                reverse(0, i, nums);
                reverse(0, nums.size() - 1, nums);
                return;
            }
        }
    }

    private void reverse(int start, int end, ArrayList<Integer> nums) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums.get(j);
            nums.set(j, nums.get(i));
            nums.set(i, temp);
        }
    }
}