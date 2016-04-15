package RemoveDuplicateFromSortedArrays2;

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
        int cur = 0;
        int i, j;
        for(i = 0; i < nums.length;){
            int checkval = nums[i];
            for (j = i; j < nums.length; j++){
                if(nums[j] != checkval){
                    break;
                }
                if(j - i < 2){
                    nums[cur++] = checkval;
                }
            }
            i = j;
        }
        return cur;

    }
}

