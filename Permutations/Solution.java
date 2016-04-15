package Permutations;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/1/23.
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (num == null || num.length == 0) {
            return result;
        }

        ArrayList<Integer> temp = new ArrayList<Integer>();
        helper(num, result, temp);
        return result;

    }

    private void helper (int[] num, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if (temp.size() == num.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (temp.contains(num[i])) {
                continue;
            }
            temp.add(num[i]);
            helper(num, result,temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main (String[] args){
        Solution Case = new Solution();
        int[] nums = {1, 2, 3};

        ArrayList<ArrayList<Integer>> result = Case.permute(nums);

        System.out.print(result);

    }
}








