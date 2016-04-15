package MajorityElement;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/13.
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int result = 0, count = 0;

        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                result = nums[ i ];
                count = 1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return result;
    }

//    public int majorityElement(int[] num) {
//        if (num.length == 1) {
//            return num[0];
//        }
//
//        Arrays.sort(num);
//        return num[num.length / 2];
//    }

//    public int majorityElement(int[] num) {
//        if(num.length==1){
//            return num[0];
//        }
//
//        Arrays.sort(num);
//
//        int prev=num[0];
//        int count=1;
//        for(int i=1; i<num.length; i++){
//            if(num[i] == prev){
//                count++;
//                if(count > num.length/2) return num[i];
//            }else{
//                count=1;
//                prev = num[i];
//            }
//        }
//
//        return 0;
//    }
}
