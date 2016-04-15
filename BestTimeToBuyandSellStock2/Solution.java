package BestTimeToBuyandSellStock2;

/**
 * Created by bingkunyang on 16/2/14.
 */
class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxvalue = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                maxvalue += diff;
            }
        }
        return maxvalue;
    }
};