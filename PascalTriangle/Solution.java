package PascalTriangle;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/2/9.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (numRows <= 0) {
            return result;
        }

        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for (int j = 1; j < pre.size(); j++) {
                cur.add(pre.get(j) + pre.get(j - 1));
            }
            cur.add(1);
            result.add(cur);
            pre = cur;
        }
        return result;
    }

//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        if(numRows<=0)
//            return res;
//        List<Integer> pre = new ArrayList<Integer>();
//        pre.add(1);
//        res.add(pre);
//        for(int i=2;i<=numRows;i++)
//        {
//            List<Integer> cur = new ArrayList<Integer>();
//            cur.add(1);
//            for(int j=0;j<pre.size()-1;j++)
//            {
//                cur.add(pre.get(j)+pre.get(j+1));
//            }
//            cur.add(1);
//            res.add(cur);
//            pre = cur;
//        }
//        return res;
//    }

    public static void main (String[] args) {
        Solution test = new Solution();
        System.out.print(test.generate(5));
    }
}
