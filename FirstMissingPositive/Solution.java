package FirstMissingPositive;

/**
 * Created by bingkunyang on 16/3/10.
 */

public class Solution {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            while(nums[i] != i + 1){
                if(nums[i] <= 0 || nums[i] >= n){
                    break;
                }
                else if(nums[i] == nums[nums[i] - 1]){
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }


    // public int firstMissingPositive(int[] nums) {
    //     int n = nums.length;

    //     for(int i = 0; i < n; i++){
    //         while(nums[i] != i){
    //             if(nums[i] < 0 || nums[i] >= n){
    //                 break;
    //             }
    //             else if(nums[i] == nums[nums[i]]){
    //                 break;
    //             }
    //             int temp = nums[i];
    //             nums[i] = nums[temp];
    //             nums[temp] = temp;
    //         }
    //     }
    //     for(int i = 0; i < n; i++){
    //         if(nums[i] != i){
    //             return i;
    //         }
    //     }

    //     return n;
    // }
}