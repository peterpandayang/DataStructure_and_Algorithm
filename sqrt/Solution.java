package sqrt;

/**
 * Created by bingkunyang on 16/1/27.
 */
public class Solution {
    public int sqrt(int k){
        int left = 1, right = k;
        while(left + 1 < right) {
            int mid = (left + right) / 2;
            if (k == mid * mid)         return mid;
            else if (k > mid * mid)     left = mid;
            else                        right = mid;
        }
        return left;
    }

    public static void main(String[] args){
        Solution a = new Solution();
        System.out.print(a.sqrt(101));
    }

}
