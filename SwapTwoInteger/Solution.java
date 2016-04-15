package SwapTwoInteger;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/16.
 */
public class Solution {
    public int[] swapTwoInteger(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        return arr;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.print(Arrays.toString(test.swapTwoInteger(1, 3)));
    }
}
