package Subset;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by bingkunyang on 16/1/5.
 *
 * 解题思路：
 * 1.新建result存储所有子集
 * 2.判断输入数组是否为空
 * 3.新建list存储单个子集
 * 4.对输入数组进行排序
 * 5.调用辅助函数
 * 6.返回结果
 *
 * 辅助函数传递四个参数：result，list，nums，pos
 * 1.将单个数组加到数组集中
 * 2.对输入数组进行遍历（从pos开始）
 * 3.将某个数加到单个数组中
 * 4.调用辅助函数
 * 5.将该加入的数从单个数组中删除
 *
 */
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        subsetsHelper(result, list, nums, 0);

        return result;
    }


    private void subsetsHelper(ArrayList<ArrayList<Integer>> result,
                               ArrayList<Integer> list, int[] nums, int pos) {

        result.add(new ArrayList<Integer>(list));

        for (int i = pos; i < nums.length; i++) {

            list.add(nums[i]);                          //对从pos位置开始的集合进行考察
            subsetsHelper(result, list, nums, i + 1);
            list.remove(list.size() - 1);               //删掉从pos位置开始的集合
        }
    }
}