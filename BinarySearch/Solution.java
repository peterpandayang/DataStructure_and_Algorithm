package BinarySearch;

//必背模板
/**
 * Created by bingkunyang on 16/1/6.
 *
 * if it has, return any position
 *
 * 解题思路：
 * 1.函数传递两个参数：输入数组nums和目标数
 * 2.判断输入数组是否是空集
 * 第一起始指针和结束指针
 * 循环判断：开始指针和结束指针是否相交或相邻
 * 1.找到中点
 * 2.判断中点和查找数的关系（等于？小于？还是大于）
 * 3.循环出来后判断开始指针是否等于目标数？结束指针是否等于目标数？否则返回-1
 *
 *
 */
public class Solution {
    public int binarySearch(int[] nums, int target){
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                end = mid;
            }else if (nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if (nums[start] == target){
            return start;
        }
        if (nums[end] == target){
            return end;
        }
        return -1;
    }
}
