package Numberof1Bits;

/**
 * Created by bingkunyang on 16/2/13.
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=1; i<33; i++){
            if(getBit(n, i) == true){
                count++;
            }
        }
        return count;
    }

    public boolean getBit(int n, int i){
        return (n & (1 << i)) != 0;
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        System.out.print(test.hammingWeight(13));
    }
}
