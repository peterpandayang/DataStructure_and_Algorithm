package PartitionArray;

/**
 * Created by bingkunyang on 16/1/29.
 */
public class Solution {
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        //write your code here
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < k) i++;
            while (i <= j && nums[j] >= k) j--;
            if (i <= j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
