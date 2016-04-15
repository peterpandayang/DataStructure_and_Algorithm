package RemoveDuplicateFromSortedArrays;

/**
 * Created by bingkunyang on 16/1/15.
 */
public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0){
            return 0;
        }
        int size = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != nums[size]){
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }
}