package CombinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bingkunyang on 16/2/29.
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (num == null || num.length == 0) return rst;

        Arrays.sort(num);
        List<Integer> list = new ArrayList<Integer>();

        helper(rst, list, num, target, 0);
        return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> list, int[] num, int target, int pos) {
        if (target == 0) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = pos; i < num.length; i++) {
            if (i > pos && num[i] == num[i - 1]) {
                continue;
            }
            if (num[i] > target) {
                break;
            }
            list.add(num[i]);
            helper(rst, list, num, target, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
