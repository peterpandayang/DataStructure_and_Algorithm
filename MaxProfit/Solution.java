package MaxProfit;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/5.
 */
public class Solution {
    public int[] maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            int[] arr = new int[2];
            return arr;
        }

        int profit = Integer.MIN_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        int[] arr = {12, 21, 23, 11,24,34, 4213,10,34};
        System.out.print(Arrays.toString(test.maxProfit(arr)));
    }

}
