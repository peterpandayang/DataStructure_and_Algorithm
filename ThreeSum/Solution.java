package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bingkunyang on 16/3/10.
 */

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();

        if(nums == null || nums.length == 0){
            return rst;
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    rst.add(list);

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }

                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return rst;
    }
}














