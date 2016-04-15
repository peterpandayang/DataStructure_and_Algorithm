package removeSpaces;

import java.util.Arrays;

/**
 * Created by bingkunyang on 16/2/20.
 */
public class Solution {
    public String cleanString (String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(arr.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            if (!arr[i].equals(" ")) {
                sb.append(arr[i]).append(" ");
            }
        }
        sb.append(arr[arr.length - 1]);
        return sb.substring(0, arr.length - 1);
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        String s = " this is the first test ";
        System.out.print(test.cleanString(s));
    }

}
