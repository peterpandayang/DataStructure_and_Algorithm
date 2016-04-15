package reverseInt;

/**
 * Created by bingkunyang on 15/12/22.
 */
public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        int rst = 0;

        while(n != 0) {
            int next_rst = rst * 10 + n % 10;
            n = n / 10;
            //如果溢出
            if(next_rst/10 != rst) {
                rst  = 0;
                break;
            }
            rst = next_rst;
        }
        return rst;
    }
}
