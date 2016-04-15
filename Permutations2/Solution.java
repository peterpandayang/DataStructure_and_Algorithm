package Permutations2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bingkunyang on 16/2/28.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) {
            return result;
        }
        Collections.sort(nums);

        int[] visited = new int[nums.size()];
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(nums, visited, result, cur);
        return result;
    }

    private void helper(ArrayList<Integer> nums, int[] visited, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> cur) {
        if (cur.size() == nums.size()) {
            result.add(new ArrayList<Integer>(cur));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (visited[i] == 1 || (i != 0 && visited[i - 1] == 0 && nums.get(i) == nums.get(i - 1))) {
                continue;
            }
            visited[i] = 1;
            cur.add(nums.get(i));
            helper(nums, visited, result, cur);
            cur.remove(cur.size() - 1);
            visited[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        System.out.print(test.permuteUnique(nums));
    }
}
