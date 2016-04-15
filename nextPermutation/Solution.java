package nextPermutation;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/28.
 */
public class Solution {
    public int[] nextPermutation(int[] num) {
        if (num == null) {
            return num;
        }

        int len = num.length;

        for (int i = len - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                int j;
                for (j = len - 1; j > i  - 1; j--) {
                    if (num[j] > num[i]) {
                        break;
                    }
                }
                swap(num, i, j);
                reverse(num, i + 1, len - 1);
                return num;
            }
        }
        reverse(num, 0, len - 1);
        return num;
    }

    private void swap (int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    private void reverse (int[] num, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            swap(num, i, j);
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] num = {4, 3, 2, 1};
        System.out.print(Arrays.toString(test.nextPermutation(num)));
    }

}
