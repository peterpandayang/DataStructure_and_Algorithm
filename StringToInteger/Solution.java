package StringToInteger;

/**
 * Created by bingkunyang on 15/12/23.
 */
public class Solution {
    public int stringToInteger(String str){
        //str: "-1234567"
        int start = 1;
        boolean negative = false;
        if (str.charAt(0) == '-'){
            negative = true;
            start = 1;
        } else if (str.charAt(0) == '+'){
            start = 1;
        }

        int number = 0;
        for (int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';
            // overflow integer
            if (!negative && number * 10 + digit < 0){
                return Integer.MAX_VALUE;
            }
            if (negative && number * 10 - digit > 0){
                return Integer.MIN_VALUE;
            }

            number = number * 10 + digit;
        }


        if (negative) {
            return -number;
        } else {
            return number;
        }

//        return negative ? -number : number;
    }

}
