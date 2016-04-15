package UpperToLower;

/**
 * Created by bingkunyang on 15/12/22.
 */
public class Solution {
    public String LowerToUpper(String str){
        String results = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                results += (char) (ch - 'a' + 'A');
            } else {
                results += ch;
            }
        }
        return results;
    }
}
