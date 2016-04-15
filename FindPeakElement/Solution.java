package FindPeakElement;

/**
 * Created by bingkunyang on 16/1/6.
 *
 * 解题思路：
 * 1.对起始节点和结束节点进行初始化
 * 2.判断起始指针和结束指针是否重合或者相邻
 * 3.初始化中间指针
 * 4.盘算中间指针和是否小于之前或者之后的数（如果都不是，那么直接返回中间指针）
 * 5.如果start指针对的数大于end，则返回start；否则返回end
 *
 *
 */
class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int start = 1, end = A.length - 2;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid - 1]){
                end = mid;
            }else if (A[mid] < A[mid + 1]){
                start = mid;
            }else{
                return mid;
            }
        }

        if(A[start] > A[end]){
            return start;
        }else{
            return end;
        }
    }
}
