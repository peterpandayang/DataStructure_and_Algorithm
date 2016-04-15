package BestTimetoBuyandSellStock;
import java.util.Arrays;
/**
 * Created by bingkunyang on 16/2/8.
 */
public class Solution {
    public int[] maxProfit(int[] prices) {
        int[] result = new int[2];
        if(prices == null || prices.length < 2) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int max = 0, left = 0, right = prices.length - 1, templeft = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[left]) {
                templeft = i;
            }
            if (prices[i] - prices[templeft] > max) {
                max = prices[i] - prices[templeft];
                left = templeft;
                right = i;
            }
        }
        result[0] = left;
        result[1] = right;
        return result;

//        public int maxProfit(int[] prices) {
//            int profit = 0;
//            int minElement = Integer.MAX_VALUE;
//            for(int i=0; i<prices.length; i++){
//                profit = Math.max(profit, prices[i]-minElement);
//                minElement = Math.min(minElement, prices[i]);
//            }
//            return profit;
//        }

//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > max) {
//                    left = i;
//                    right = j;
//                    max = prices[j] - prices[i];
//                }
//            }
//        }
//        result[0] = left;
//        result[1] = right;
//        return result;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        int[] arr = {12, 13, 1, 45, 32, 234, 43};
        System.out.println(Arrays.toString(test.maxProfit(arr)));
    }
}

