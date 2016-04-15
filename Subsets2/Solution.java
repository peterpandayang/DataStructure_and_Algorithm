package Subsets2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
/**
 * Created by bingkunyang on 16/1/5.
 */
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (S == null || S.size() == 0) {
            return result;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.sort(S);
        backTrack(result, list, S, 0);
        return result;
    }

    private void backTrack(ArrayList<ArrayList<Integer>> result,
                           ArrayList<Integer> list, ArrayList<Integer> num, int pos) {
        result.add(new ArrayList<Integer>(list));

        for (int i = pos; i < num.size(); i++) {
            if (i != pos && num.get(i) == num.get(i-1)){
                continue;
            }
            list.add(num.get(i));
            backTrack(result, list, num, i + 1);
            list.remove(list.size() - 1);
        }
    }
}

//public class Solution {
//    public ArrayList<ArrayList<Integer>> subsets(int[] num) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        if(num == null || num.length ==0) {
//            return result;
//        }
//        Arrays.sort(num);
//        subsetsHelper(result, list, num, 0);
//
//        return result;
//    }
//
//    private void subsetsHelper(ArrayList<ArrayList<Integer>> result,
//                               ArrayList<Integer> list, int[] num, int pos) {
//
//        result.add(new ArrayList<Integer>(list));
//
//        for (int i = pos; i < num.length; i++) {
//            if ( i != pos && num[i] == num[i - 1]) {
//                continue;                                 结束本次循环
//            }
//            list.add(num[i]);
//            subsetsHelper(result, list, num, i + 1);
//            list.remove(list.size() - 1);
//        }
//    }
//}