package Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingkunyang on 16/2/28.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (n == 0 || k == 0) {
            return rst;
        }
        List<Integer> list = new ArrayList<Integer>();
        helper(rst, list, n, k, 1);
        return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> list, int n, int k, int start) {
        if (list.size() == k) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            helper(rst, list, n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        System.out.print(test.combine(4, 2));
    }
}
