package TwoSum;

/**
 * Created by bingkunyang on 16/1/2.
 */



import java.util.HashMap;
import java.util.Map;
public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put (nums[0], 0);
        for (int i = 1; i < nums.length; i++){
            if (map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}