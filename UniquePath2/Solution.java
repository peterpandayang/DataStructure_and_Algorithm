package UniquePath2;

/**
* Created by bingkunyang on 16/2/9.
*/
public class Solution {
    public int uniquePaths2(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }

        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] != 1) {
                result[i][0] = 1;
            }
            else {
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] != 1) {
                result[0][j] = 1;
            }
            else {
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j ++) {
                if (obstacleGrid[i][j] != 1) {
                    result[i][j] = result[i][j - 1] + result[i - 1][j];
                }
                else {
                    result[i][j] = 0;
                }

            }
        }
        return result[m - 1][n - 1];
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        int[][] input = {{0, 0, 0}, {0, 1, 0}, {0, 0 , 0}};
        System.out.print(test.uniquePaths2(input));
    }
}
