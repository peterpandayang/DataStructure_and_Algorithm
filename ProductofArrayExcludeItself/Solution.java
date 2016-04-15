package ProductofArrayExcludeItself;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/2/24.
 */
public class Solution {
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> result = new ArrayList<Long>();
        if (A == null || A.size() == 0) {
            return result;
        }

        ArrayList<Long> left = new ArrayList<Long>(A.size());
        ArrayList<Long> right = new ArrayList<Long>(A.size());




        left.add(0, (long)1);
        for (int i = 1; i < A.size(); i++) {
            left.add((long)A.get(i - 1) * left.get(i - 1));
        }


        right.add((long)1);
        for (int i = 1; i < A.size(); i++) {
            right.add(0, (long)A.get(A.size() - i) * right.get(0));
        }


        for (int i = 0; i < A.size(); i++) {
            result.add(left.get(i) * right.get(i));
        }
        return result;

    }

    public static void main (String[] args) {
        Solution test = new Solution();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            A.add(i + 1);
        }

        System.out.print(test.productExcludeItself(A));

    }
}
