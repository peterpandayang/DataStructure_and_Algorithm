package BestTimeToBuyandSellStock3;

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

        int len = prices.length;
        int[] premax =  new int[len];
        int[] postmax = new int[len];

        //use dynamic programming to get the max profit before i;
        int minvalue = prices[0];
        for (int i = 1; i < len; i++) {
            minvalue = Math.min(minvalue, prices[i]);
            premax[i] = Math.max(premax[i - 1], prices[i] - minvalue);
        }

        //use dynamic programming to get the max profit after i;
        int maxvalue = prices[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            maxvalue = Math.max(maxvalue, prices[i]);
            postmax[i] = Math.max(postmax[i + 1], maxvalue - prices[i]);
        }

        //iterate the whole array and get the max profit by merging the pre and post together
        int maxprofit = 0;
        for(int i = 0; i < len; i++) {
            maxprofit = Math.max(maxprofit, premax[i] + postmax[i]);
        }

        return maxprofit;
    }
};

