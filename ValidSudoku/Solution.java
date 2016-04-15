package ValidSudoku;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/28.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[9];

        for (int i = 0; i < 9; i++) {
            Arrays.fill(visited, false);
            for (int j = 0; j < 9; j++) {
                if (!isValid(board[i][j], visited)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(visited, false);
            for (int j = 0; j < 9; j++) {
                if (!isValid(board[j][i], visited)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                Arrays.fill(visited, false);
                for (int k = 0; k < 9; k++) {
                    if (!isValid(board[i + k / 3][j + k % 3], visited)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isValid(char c, boolean[] visited) {
        if (c == '.') {
            return true;
        }

        int temp = c - '1';
        if (visited[temp]) {
            return false;
        }

        visited[temp] = true;
        return true;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        char[][] board = {
                {'1', '.', '.', '.', '.', '7', '.', '9', '.'},
                {'.', '3', '.', '.', '2', '.', '.', '.', '8'},
                {'.', '.', '9', '6', '.', '.', '5', '.', '.'},
                {'.', '.', '5', '3', '.', '.', '9', '.', '.'},
                {'.', '1', '.', '.', '8', '.', '.', '.', '2'},
                {'6', '.', '.', '.', '.', '4', '.', '.', '.'},
                {'3', '.', '.', '.', '.', '.', '.', '1', '.'},
                {'.', '4', '.', '.', '.', '.', '.', '.', '7'},
                {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
        };
        System.out.print(test.isValidSudoku(board));
    }
}
