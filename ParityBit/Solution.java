package ParityBit;

/**
 * Created by bingkunyang on 16/2/13.
 */
public class Solution {
    int kFourBitParityLookupTable = 0x6996;   //0b0110100110010110

    int four_bit_parity_lookup(int x) {
        return kFourBitParityLookupTable >> x;
    }

    int parity4(int x) {
        x ^= x >> 32;
        x ^= x >> 16;
        x ^= x >> 8;
        x ^= x >> 4;
        x &= 0xf;   //only want the last 4 bits of x
        //return the LSB, which is the parity
        return four_bit_parity_lookup(x) & 1;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.print(test.four_bit_parity_lookup(35));
    }
}
