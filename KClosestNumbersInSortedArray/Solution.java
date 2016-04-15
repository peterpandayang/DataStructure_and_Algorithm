package KClosestNumbersInSortedArray;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/4.
 */
public class Solution {
    public int[] kClosestNumbers(int[] A, int target, int k) {
         if (A == null || A.length == 0) return A;
         int start = 0, end = A.length - 1;
         while (start + 1 < end) {
             int mid = start + (end - start) / 2;
             if (target >= A[mid]) {
                 start = mid;
             }
             else {
                 end = mid;
             }
         }



         int[] newArr = new int[k];
         int length = k;
         int p = 0;
         while (p < length) {
             if (start >= 0 && end <= A.length - 1) {
                 int diffstart = Math.abs(target - A[start]);
                 int diffend = Math.abs(A[end] - target);
                 if (diffstart <= diffend) {
                     newArr[p] = A[start];
                     k--;
                     p++;
                     start--;
                 }
                 else {
                     newArr[p] = A[end];
                     k--;
                     p++;
                     end++;
                 }
             }

             else {
                 if (start >= 0 && end > A.length - 1) {
                     newArr[p] = A[start];
                     k--;
                     p++;
                     start--;
                 }
                 else if (start < 0 && end <= A.length - 1){
                     newArr[p] = A[end];
                     k--;
                     p++;
                     end++;
                 }
             }
         }
         return newArr;
     }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = {1, 2, 3};
        int[] result = test.kClosestNumbers(arr, 2, 3);
        System.out.print(Arrays.toString(result));
    }
}
