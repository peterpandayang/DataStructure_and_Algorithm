package ThreeSumClosest;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/3/10.
 */


public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int rst = Integer.MAX_VALUE / 2;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    return target;
                }else{
                    rst = Math.abs(target - sum) < Math.abs(target - rst) ? sum : rst;
                    if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return rst;
    }
}