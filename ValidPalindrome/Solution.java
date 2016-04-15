package ValidPalindrome;

/**
 * Created by bingkunyang on 15/12/30.
 */
public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (!Character.isLetterOrDigit(ch1)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch2)){
                j--;
                continue;
            }

            if (ch1 != ch2) {
                return false;
            }
            i = i++;
            j = j--;
        }
        return true;
    }
}
