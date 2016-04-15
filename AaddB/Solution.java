package AaddB;

/**
 * Created by bingkunyang on 16/3/8.
 */
public class Solution {
    public int aplusb(int a, int b) {
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = (carry) << 1;
        }
        return a;
    }
}
