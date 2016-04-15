package PermutationString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bingkunyang on 16/2/28.
 */
class Solution {
    static Set<String> perm(String s) {
        Set<String> ret = new HashSet<String>();
        helper(s.toCharArray(), ret, 0);

        return ret;
    }

    static void helper(char[] s, Set<String> ret, int start) {
        if (start == s.length) {
            ret.add(new String(s));
            return;
        }

        for (int i = start; i < s.length; ++i) {
            swap(s, i, start);
            helper(s, ret, start+1);
            swap(s, i, start);
        }
    }

    static void swap(char[] s, int i, int j) {
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }

    public static void main(String[] args) {
        String s =  "123";
        System.out.println(perm(s));
    }
}