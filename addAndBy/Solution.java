package addAndBy;

/**
 * Created by bingkunyang on 16/2/4.
 */


//这道题先画出二叉树的图，分析出应该先做乘法，后做加法；
//得出的最优解是用Queue来做，每次对队首进行判断（队首最小）；
//如果队首大于target，那么直接返回false.
//以下是错误解

public class Solution {

    public boolean check (int target) {
        boolean flag = false;
        return flag == true;
    }

    private void calculation (int addnumber, int bynumber, boolean flag) {
        if (addnumber <= 0 && bynumber <=0) {
            return;
        }

        if (addnumber == 1 || bynumber == 1) {
            flag = true;
        }

        if (addnumber > 5) {
            calculation(addnumber - 5, bynumber, flag);
        }

        if (bynumber > 5) {
            calculation(addnumber, bynumber - 5, flag);
        }

        if (addnumber % 3 == 1) {
            calculation(addnumber / 3, bynumber, flag);
        }

        if (bynumber % 3 == 1) {
            calculation(addnumber, bynumber / 3, flag);
        }

    }

    public static void main (String[] args) {
        Solution a = new Solution();
        System.out.println(a.check(13));
    }
}
