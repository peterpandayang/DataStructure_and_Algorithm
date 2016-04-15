package Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingkunyang on 16/2/9.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }

        int[] dp = new int[triangle.size()];

        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
            dp[i] = triangle.get(triangle.size() - 1).get(i);
        }

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sublist = new ArrayList<Integer>(2);
        list.add(sublist);

        sublist.add(4);
        list.add(sublist);

        sublist.add(7);
        list.add(sublist);

        sublist.add(1);
        list.add(sublist);

        System.out.println(list);
        System.out.print(test.minimumTotal(list));
    }
}
