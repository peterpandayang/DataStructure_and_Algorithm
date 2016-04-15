package PalindromePartitioning;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by bingkunyang on 16/2/12.
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<List<String>>();
        generate(result, new LinkedList<String>(), s);
        return result;
    }

    private void generate(List<List<String>> result, LinkedList<String> list, String s) {
        if (s.length() == 0) {
            List<String> res = new LinkedList<String>(list);
            result.add(res);
            return;
        }
        int length = s.length();
        for (int i = 1; i <= length; i++) {
            String sub = s.substring(0, i);
            if (isPalindrome(sub)) {
                list.add(sub);
                generate(result, list, s.substring(i, length));
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }


}
