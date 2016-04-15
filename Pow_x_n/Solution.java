package Pow_x_n;

/**
 * Created by bingkunyang on 16/2/15.
 */
public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        if (n > 0) {
            return helper(x, n);
        }

        return helper(1 / x, -n);

    }

    private double helper(double x, int n) {
        if (n == 0) {
            return 1;
        }

        else if (n == 1) {
            return x;
        }

        return helper(x, n / 2) * helper(x, n / 2) * helper(x, n % 2);

    }
}
