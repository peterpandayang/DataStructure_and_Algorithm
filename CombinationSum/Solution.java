package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bingkunyang on 16/2/28.
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();

        if (candidates == null || candidates.length == 0) {
            return rst;
        }

        Arrays.sort(candidates);

        List<Integer> list = new ArrayList<Integer>();
        helper(rst, list, candidates, target, 0);
        return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> list, int[] candidates, int target, int pos) {

        if (target == 0) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                list.add(candidates[i]);
                helper(rst, list, candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
