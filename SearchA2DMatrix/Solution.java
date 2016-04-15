package SearchA2DMatrix;

/**
 * Created by bingkunyang on 16/1/6.
 *
 * 解题思路：
 * 1.判断二维矩阵是否为空
 * 2.判断行矩阵是否为空
 * 3.对行和列进行初始化
 * 4.对起始指针和结束指针初始化
 * 5.循环找到可能存在目标数的两行
 * 6.判断目标数存在于哪一行
 * 7.对起始指针和结束指针初始化
 * 8.找到目标数可能等于的相邻的两个数
 * 9.判断者两个相邻的数是否是目标数（不是则返回false）
 */
public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;

        // find the row index, the last number <= target
        int start = 0, end = row - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[end][0] <= target) {
            row = end;
        } else if (matrix[start][0] <= target) {
            row = start;
        } else {
            return false;
        }

        // find the column index, the number equal to target
        start = 0;
        end = column - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        }
        return false;
    }
}
