package FindMinimuminRotatedSortedArray;

/**
 * Created by bingkunyang on 16/1/7.
 *
 *
 * 解题思路：
 * 1.判断原数组是否是空
 * 2.对start和end进行初始化
 * 3.找到右端点
 * 4.循环判断start和end是否相邻或者重合
 * 5.初始化mid
 * 6.判断mid在哪条线上面
 * 7.找到小于右端点的值
 *
 *
 */
public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        int target = nums[nums.length - 1];

        // find the first element <= target
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] <= target) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}