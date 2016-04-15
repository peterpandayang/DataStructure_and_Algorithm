package BestTimeToBuyandSellStock4;

/**
 * Created by bingkunyang on 16/2/14.
 */
class Solution {
    /**
     * @param k: An integer
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int k, int[] prices) {
        if (k == 0) {
            return 0;
        }

        if ( k >= prices.length / 2) {
            int maxprofit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxprofit += prices[i] - prices[i - 1];
                }
            }
            return maxprofit;
        }

        int n = prices.length;
        int[][] sellmax = new int[n][n];
        int[][] globlemax = new int[n][n];
        sellmax[0][0] = globlemax[0][0] = 0;

        for (int i = 1; i <= k; i++) {
            sellmax[0][i] = globlemax[0][i] = 0;
        }

        for (int i = 1; i < n; i++) {
            int gain = prices[i] - prices[i - 1];
            sellmax[i][0] = 0;
            for (int j = 1; j <= k; j++) {
                sellmax[i][j] = Math.max(sellmax[i - 1][j] + gain, globlemax[i - 1][j - 1] + gain);
                globlemax[i][j] = Math.max(globlemax[i - 1][j], sellmax[i][j] );
            }
        }
        return globlemax[n - 1][k];
    }
};












