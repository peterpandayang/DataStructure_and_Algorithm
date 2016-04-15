package isPalindrome;

/**
 * Created by bingkunyang on 15/12/23.
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

//    public boolean isPalindrome(String s) {
//        if(s == null || s.length() == 0){
//            return true;
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = s.length() - 1 ;i >= 0; i--){//这里可以优化，无需过滤，遇到非法字符跳过
//            if((s.charAt(i) >= '0' && s.charAt(i) <= '9')||(s.charAt(i) >= 'a'  && s.charAt(i) <= 'z' )|| (s.charAt(i) >= 'A'  && s.charAt(i) <= 'Z' )){
//                sb.append(s.charAt(i));
//            }
//        }
//        s = sb.toString();
//        for(int i = 0 ; i < s.length() / 2; i++){
//            if(s.charAt(i) != s.charAt(s.length() - 1 - i) && s.charAt(i) != s.charAt(s.length() - 1 - i) + 32 && s.charAt(i) != s.charAt(s.length() - 1 - i) - 32){
//                return false;
//            }
//        }
//        return true;
//    }
}