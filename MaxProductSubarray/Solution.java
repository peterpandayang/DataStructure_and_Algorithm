package MaxProductSubarray;

/**
 * Created by bingkunyang on 16/2/11.
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int len = nums.length, localmax = nums[0], localmin = nums[0], globlemax = nums[0], premax = nums[0], premin = nums[0];

        for (int i = 1; i < len; i++) {
            localmax = Math.max(nums[i] * premax, nums[i] * premin);
            localmax = Math.max(localmax, nums[i]);
            globlemax = Math.max(localmax, globlemax);
            localmin = Math.min(nums[i] * premax, nums[i] * premin);
            localmin = Math.min(localmin, nums[i]);
            premax = localmax;
            premin = localmin;
        }

        return globlemax;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        int[] arr = {2, 3, -2, 4};
        System.out.print(test.maxProduct(arr));
    }
}
