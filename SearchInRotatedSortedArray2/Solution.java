package SearchInRotatedSortedArray2;

/**
 * Created by bingkunyang on 16/1/25.
 */
public class Solution {
    public boolean search(int[] A, int target) {
        for (int i = 0; i < A.length; i ++) {
            if (A[i] == target) {
                return true;
            }
        }
        return false;
    }
}
