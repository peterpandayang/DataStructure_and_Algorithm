package PalindromeNumber;

/**
 * Created by bingkunyang on 16/2/15.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        //negative numbers are not palindrome
        if (x < 0)
            return false;

        // initialize how many zeros
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        System.out.print(test.isPalindrome(101929101));
    }
}