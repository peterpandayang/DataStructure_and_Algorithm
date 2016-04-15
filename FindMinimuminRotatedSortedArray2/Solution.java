package FindMinimuminRotatedSortedArray2;

/**
 * Created by bingkunyang on 16/1/25.
 */
public class Solution {
    public int findMin(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }
}
