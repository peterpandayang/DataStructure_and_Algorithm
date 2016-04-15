package floodFill;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by bingkunyang on 16/2/22.
 */


class Solution {
    static void fill(char[][] board, int i, int j) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[] {i,j});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int row = tmp[0], col = tmp[1];
            board[row][col] = '2';
            if(row-1 >= 0 && board[row-1][col] == '0'){
                q.add(new int[] {row-1,col});
            }
            if(row+1 < board.length && board[row+1][col] == '0'){
                q.add(new int[] {row+1,col});
            }
            if(col-1 >= 0 && board[row][col-1] == '0') {
                q.add(new int[] {row,col-1});
            }
            if(col+1 < board[0].length && board[row][col+1] == '0') {
                q.add(new int[] {row,col+1});
            }
        }
        print(board);
    }

    static void print(char[][] b) {
        for(int i = 0; i < b.length; i++){
            System.out.println(new String(b[i]));
        }
    }

    public static void main(String[] args) {
        String[] board = {
                "010000001",
                "010111101",
                "100100001",
                "010110001",
                "111110000",
                "000000001"
        };

        char[][] b = new char[board.length][board[0].length()];
        for (int i = 0; i < b.length; ++i) {
            b[i] = board[i].toCharArray();
        }

        fill(b, 2, 2);
    }

}



//public class Solution {
//    //DFS
////    public static void floodFill(int[][] screen , int x, int y, int color){
////        int prev = screen[x][y];
////        floodFillUtil(screen, x, y, prev, color);
////    }
////
////    public static void floodFillUtil(int[][] screen, int x, int y, int prev, int newc){
////        //base case
////        if(x < 0 || x >= screen.length || y < 0 || y >= screen[0].length){
////            return;
////        }
////        if(screen[x][y] != prev){
////            return;
////        }
////        screen[x][y] = newc;
////        //recursive N,E, W,S four direction dfs
////        floodFillUtil(screen, x + 1, y, prev, newc);
////        floodFillUtil(screen, x - 1, y, prev, newc);
////        floodFillUtil(screen, x, y + 1, prev, newc);
////        floodFillUtil(screen, x, y - 1, prev, newc);
////    }
//
//    //BFS
//    public static class Pair{
//        int x, y;
//        public Pair(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//    }
//    public static void floodFill(int[][] screen, int x, int y, int color){
//        int m = screen.length;
//        int n = screen[0].length;
//        if(screen == null || screen.length == 0 || x >= m || y >= n){
//            return;
//        }
//        //System.out.println( m + "  " + n);
//        int prev = screen[x][y];
//        //screen[x][y] = color;
//
//        Queue<Pair> queue= new LinkedList<Pair>();
//        queue.offer(new Pair(x, y));
//        //mark visit
//        int[][] visit = new int[m][n];
//        int cx, cy;
//        while(!queue.isEmpty()){
//            Pair cur = queue.poll();
//
//            cx = cur.x;
//            cy =  cur.y;
//
//            //reset color
//            screen[cx][cy] = color;
//            visit[x][y] = 1; // mark has modified
//
//            if(cx + 1 < m &&  screen[cx + 1][cy] == prev && visit[cx + 1][cy] == 0){
//                queue.offer(new Pair(cx + 1, cy));
//            }
//            if(cx - 1 >= 0 && screen[cx - 1][cy] == prev && visit[cx - 1][cy] == 0){
//                queue.offer(new Pair(cx - 1, cy));
//            }
//            if(cy + 1 < n && screen[cx][cy + 1] == prev && visit[cx ][cy + 1] == 0){
//                queue.offer(new Pair(cx , cy + 1));
//            }
//            if(cy - 1 >= 0 && screen[cx][cy -1] == prev && visit[cx ][cy - 1] == 0){
//                queue.offer(new Pair(cx , cy - 1));
//            }
//        }
//
//    }
//
//
//    public static void main (String[] args) {
//        Solution test = new Solution();
//        int[][] screen =    {{1, 1, 1, 1, 1, 1, 1, 1},
//                            {1, 1, 1, 1, 1, 1, 0, 0},
//                            {1, 0, 0, 1, 1, 0, 1, 1},
//                            {1, 2, 2, 2, 2, 0, 1, 0},
//                            {1, 1, 1, 2, 2, 0, 1, 0},
//                            {1, 1, 1, 2, 2, 2, 2, 0},
//                            {1, 1, 1, 1, 1, 2, 1, 1},
//                            {1, 1, 1, 1, 1, 2, 2, 1},
//        };
//        test.floodFill(screen, 4, 4, 3);
//        System.out.println(Arrays.toString(screen[0]));
//        System.out.println(Arrays.toString(screen[1]));
//        System.out.println(Arrays.toString(screen[2]));
//        System.out.println(Arrays.toString(screen[3]));
//        System.out.println(Arrays.toString(screen[4]));
//        System.out.println(Arrays.toString(screen[5]));
//        System.out.println(Arrays.toString(screen[6]));
//        System.out.println(Arrays.toString(screen[7]));
//    }
//}
