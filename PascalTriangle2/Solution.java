package PascalTriangle2;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/2/9.
 */
public class Solution {
    public ArrayList<Integer> generate(int numRows) {
        ArrayList<Integer> pre = new ArrayList<Integer>();
        if (numRows <= 0) {
            return pre;
        }

        pre.add(1);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for (int j = 1; j < pre.size(); j++) {
                cur.add(pre.get(j) + pre.get(j - 1));
            }
            cur.add(1);
            pre = cur;
        }
        return pre;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        System.out.print(test.generate(5));
    }
}
