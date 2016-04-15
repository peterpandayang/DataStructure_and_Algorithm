package GenerateParentheses;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/2/29.
 */
public class Solution {
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> rst = new ArrayList<String>();
        if (n == 0) {
            return rst;
        }
        String s = "";
        helper(rst, s, n, n);
        return rst;
    }

    private static void helper(ArrayList<String> rst, String s, int leftNum, int rightNum) {
        if (leftNum == 0 && rightNum == 0) {
            rst.add(s);
            return;
        }

        if (leftNum > 0) {
            helper(rst, s + "(", leftNum - 1, rightNum);
        }
        if (rightNum > leftNum && leftNum > 0) {
            helper(rst, s + ")", leftNum, rightNum - 1);
        }
    }
}
