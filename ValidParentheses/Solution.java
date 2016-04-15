package ValidParentheses;
import java.util.Stack;

/**
 * Created by bingkunyang on 15/12/29.
 */
public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        if (s.length() == 0 || s.length() == 1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));}
            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (s.charAt(i) == ')')
                    if (top != '(')
                        return false;
                    else if (s.charAt(i) == ']')
                        if (top != '[')
                            return false;
                        else if (s.charAt(i) == '}')
                            if (top != '{')
                                return false;
            }
        }
        return stack.isEmpty();
    }
}