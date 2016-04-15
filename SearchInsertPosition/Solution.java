package SearchInsertPosition;

/**
 * Created by bingkunyang on 16/1/6.
 *
 * 解题思路：
 * 1.函数传入两个参数（原数组和插入数）
 * 2.判断原数组是否为空
 * 3.对起始指针和结束指针初始化
 * 4.用循环找出应该插入的位置的范围
 * 5.找到第一个比目标数大的数，并将该数的位置返回
 *
 */
public class Solution {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int start = 0, end = A.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if (A[mid] == target){
                return mid;
            }else if (A[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        if (A[start] >= target){
            return start;
        }
        else if (A[end] >= target){
            return end;
        }else{
            return end + 1;
        }
    }
}
