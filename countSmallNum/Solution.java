package countSmallNum;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bingkunyang on 15/12/4.
 */
public class Solution {
    /**
     * @param A: An integer array
     * @return: The number of element in the array that
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        Arrays.sort(A);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int q : queries) {
            res.add(binarySearch(A, q));
        }
        return res;
    }
    private int binarySearch(int[] A, int val) {
        int start = 0, end = A.length - 1;
        int res = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] >= val) {
                end = mid - 1;
            } else {
                res = mid + 1;
                start = mid + 1;
            }
        }
        return res;
    }
}

