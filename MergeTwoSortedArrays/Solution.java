package MergeTwoSortedArrays;

/**
 * Created by bingkunyang on 16/1/14.
 */

// n代表A数组的有数字的长度

class Solution {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int end = A.length - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (A[m] > B[n]) {
                A[end--] = A[m--];
            }else {
                A[end--] = B[n--];
            }
        }
        while (n >= 0) {
            A[end--] = B[n--];
        }
    }
}