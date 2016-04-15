package SearchForARange;

/**
 * Created by bingkunyang on 16/1/6.
 *
 * 阶梯思路：
 * 1.给函数传递两个参数（原数组A和目标数）
 * 2.判断数组长度是否为0
 * 3.定义一个长度为2的数组用来存储返回值
 * 4.将开始指针和结束指针初始化
 * 5.用循环找到左边界
 * 6.重新初始化起始指针和结束指针
 * 7.用循环找到右边界
 * 8.输出返回值
 *
 */
public class Solution {
    /**
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        if (A.length == 0){
            return new int[]{-1, -1};
        }
        int start = 0, end = A.length - 1, mid;
        int[] bound = new int[2];

        // left search

        while (start + 1 < end){
            mid = start + (end - start) / 2;
            if (A[mid] == target){
                end = mid;
            }else if(A[mid] < target){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(A[start] == target){
            bound[0] = start;
        }else if(A[end] == target){
            bound[0] = end;
        }else{
            bound[0] = bound[1] = -1;
            return bound;
        }

        start = 0;
        end = A.length - 1;
        while (start + 1 < end){
            mid = start + (end - start) / 2;
            if (A[mid] == target){
                start = mid;
            }else if(A[mid] < target){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(A[end] == target){
            bound[1] = end;
        }else if(A[start] == target){
            bound[1] = start;
        }else {
            bound[0] = bound[1] = -1;
            return bound;
        }
        return bound;
    }
}
