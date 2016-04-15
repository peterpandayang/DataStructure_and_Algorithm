package KthsmallestFromSum;


import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/20.
 */
public class Solution {
    public int findKthsmallest (int[] a, int[] b, int k) {
        int m = a.length, n = b.length;
        int[] arr = new int[m * n];

        for(int i = 0; i < m; i++)  {
            for (int j = 0; j < n; j++) {
                arr[i * n + j] = a[i] + b[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        int[] a = {1, 2, 4, 5};
        int[] b = {2, 5, 6, 7};
        System.out.print(test.findKthsmallest(a, b, 3));
    }
}
