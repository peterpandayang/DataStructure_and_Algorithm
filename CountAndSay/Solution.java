package CountAndSay;

/**
 * Created by bingkunyang on 16/3/10.
 */


public class Solution {
    public String countAndSay(int n) {
        String oldString = "1";

        while(n > 1){
            StringBuilder sb = new StringBuilder();
            char[] oldChars = oldString.toCharArray();

            for(int i = 0; i < oldChars.length; i++){
                int count = 1;
                while((i + 1) < oldChars.length && oldChars[i] == oldChars[i + 1]){
                    i++;
                    count++;
                }
                sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }

            oldString = sb.toString();
            n = n - 1;
        }

        return oldString;
    }
}