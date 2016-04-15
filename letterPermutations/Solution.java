package letterPermutations;

import java.util.ArrayList;

/**
 * Created by bingkunyang on 16/2/20.
 */
public class Solution {
    public ArrayList<ArrayList<Character>> permutations (String letters) {
        ArrayList<ArrayList<Character>> rst = new ArrayList<ArrayList<Character>>();
        Character[] arr = new Character[letters.length()];
        int[] visited = new int[arr.length];
        for (int i = 0; i < letters.length(); i++) {
            arr[i] = letters.charAt(i);
        }
        ArrayList<Character> list = new ArrayList<Character>();
        helper(arr, rst, list, visited);
        return rst;
    }

    private void helper(Character[] arr, ArrayList<ArrayList<Character>> rst, ArrayList<Character> list, int[] visited) {

        // if the rst length == arr length, print out the rst;
        if (rst.size() == arr.length) {
            rst.add(new ArrayList<Character>(list));
            return;
        }

        for (int i  = 0; i < arr.length; i++) {
            // if the letter has is the same as the previous letter, just go to check the following letter;
            if (visited[i] == 1 || (i != 0 && arr[i] == arr[i - 1] && visited[i - 1] == 0)) {
                continue;
            }
            visited[i] = 1;
            list.add(arr[i]);
            helper(arr, rst, list, visited);
            list.remove(rst.size());
            visited[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String letters = "abcd";
        System.out.print(test.permutations(letters));
    }

}
