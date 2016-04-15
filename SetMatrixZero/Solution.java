package SetMatrixZero;

/**
 * Created by bingkunyang on 16/1/15.
 */
public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @return: Void
     */
    public void setZeroes(int[][] matrix) {
        // write your code here
        if (matrix.length == 0){
            return;
        }
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row[i] == true || col[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}