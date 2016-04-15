package TwoStringsAreAnagrams;
import java.util.Arrays;

/**
 * Created by bingkunyang on 15/12/30.
 */
public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        s = sortCharacters(s);
        t = sortCharacters(t);
        return s.equals(t);
    }
    private String sortCharacters(String str){
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
};










