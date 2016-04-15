package StringToInteger2;

/**
 * Created by bingkunyang on 15/12/23.
 */
class Solution {
    /**
     * @param str: A string
     * @return An integer
     */
    public int atoi(String str) {
        if(str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        int sign = 1;
        int index = 0;

        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        long num = 0;
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                break;
            num = num * 10 + (str.charAt(i) - '0');
            if (num > Integer.MAX_VALUE ) {
                break;
            }
        }
        if (num * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (num * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)num * sign;
    }

//    public static boolean checkOverflow(int number, int digit){
//        int newNumber = number * 10 + digit;
//        return !(newNumber % 10 == digit && newNumber / 10 == number);
//    }

//    public static boolean checkNegativeOverflow(int number, int digit){
//        if (-number * 10 - digit == Integer.MIN_VALUE){
//            return false;
//        }
//        return checkNegativeOverflow(number, digit);
//    }
}


