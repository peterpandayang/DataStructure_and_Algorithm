package SudokuSolver;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by bingkunyang on 16/3/10.
 */

public class Solution {

    public void solveSudoku(char[][] board){
        solve(board);
    }


    public boolean solve(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    continue;
                }

                for(int k = 1; k <= 9; k++){
                    board[i][j] = (char)(k + '0');
                    if(isValid(board, i, j) && solve(board)){
                        return true;
                    }
                    board[i][j] = '.';
                }
                return false;
            }
        }
        return true;
    }


    public boolean isValid(char[][] board, int a, int b){
        Set<Character> contained = new HashSet<Character>();
        for(int j = 0; j < 9; j++){
            if(contained.contains(board[a][j])){
                return false;
            }
            if(board[a][j] > '0' && board[a][j] <= '9'){
                contained.add(board[a][j]);
            }

        }

        contained = new HashSet<Character>();
        for(int i = 0; i < 9; i++){
            if(contained.contains(board[i][b])){
                return false;
            }
            if(board[i][b] > '0' && board[i][b] <= '9'){
                contained.add(board[i][b]);
            }
        }

        contained = new HashSet<Character>();
        for(int m = 0; m < 3; m++){
            for(int n = 0; n < 3; n++){
                int x = a / 3 * 3 + m, y = b / 3 * 3 + n;
                if(contained.contains(board[x][y])){
                    return false;
                }
                if (board[x][y] > '0' && board[x][y] <= '9'){
                    contained.add(board[x][y]);
                }
            }
        }
        return true;
    }

//    public void solveSudoku(char[][] board) {
//        Stack<Integer> empty = new Stack<Integer>();
//        for(int i=0; i<=8; i++) {
//            for(int j=0; j<=8; j++) {
//                if(board[i][j]=='.') {
//                    empty.push(9*i+j);
//                }
//            }
//        }
//        solve(board, empty);
//    }
//
//    private boolean solve(char[][] board, Stack<Integer> empty) {
//        if(empty.size()==0) return true;
//        int firstValue = empty.peek();
//        int row = firstValue/9, col = firstValue%9;
//        for(int k=1; k<=9; k++) {
//            if(isSafe(board, row, col, (char)(k+'0'))) {
//                board[row][col] = (char)(k+'0');
//                empty.pop();
//                if(solve(board, empty)) return true;
//                board[row][col] = '.';
//                empty.push(firstValue);
//            }
//        }
//        return false;
//    }
//
//    private boolean isSafe(char[][] board, int i, int j, char ch) {
//        for(int k=0; k<9; k++) {
//            if(board[k][j]==ch) return false;
//            if(board[i][k]==ch) return false;
//        }
//        int starti = 3 * (i/3), startj = 3 * (j/3);
//        for(int k=starti; k<starti+3; k++) {
//            for(int l=startj; l<startj+3; l++) {
//                if(board[k][l]==ch) return false;
//            }
//        }
//        return true;
//    }
}
