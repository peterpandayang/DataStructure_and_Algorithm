package SingleNumber2;

/**
 * Created by bingkunyang on 16/3/10.
 */

public class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int rst = 0;
        int[] count = new int[32];
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < nums.length; j++){
                count[i] += nums[j] >> i & 1;
                count[i] %= 3;
            }
            rst |= (count[i] << i);
        }
        return rst;
    }
}