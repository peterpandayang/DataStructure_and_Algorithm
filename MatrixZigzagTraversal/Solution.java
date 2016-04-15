package MatrixZigzagTraversal;

/**
 * Created by bingkunyang on 16/2/15.
 */
public class Solution {
    public int[] printZMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return null;
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m*n];
        int j = 0;
        for(int i = 0; i < m + n - 1; i++){
            if(i % 2 == 1){
                for(int y = Math.min(i, n - 1); y >= Math.max(0, i - m + 1); y--){
                    res[j++] = matrix[i-y][y];
                }
            } else{
                for(int x = Math.min(i, m - 1); x >= Math.max(0, i - n + 1); x--){
                    res[j++] = matrix[x][i-x];
                }
            }
        }
        return res;
    }
}
