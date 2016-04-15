package letterCombination;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bingkunyang on 15/12/2.
 */
public class Solution {
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public ArrayList<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();      //定义哈希表map
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        map.put(0, "");

        ArrayList<String> result = new ArrayList<String>();                 //定义String数组链表result

        if(digits == null || digits.length() == 0)
            return result;

        ArrayList<Character> temp = new ArrayList<Character>();             //定义Char数组链表temp
        getString(digits, temp, result, map);

        return result;
    }

    public void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
        if(digits.length() == 0){
            char[] arr = new char[temp.size()];                             //定义Char数组arr
            for(int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }

        Integer curr = Integer.valueOf(digits.substring(0,1));              //定义需要取出来的某个数字curr
        String letters = map.get(curr);                                     //找到去除数字对应的英文字母letters
        for(int i=0; i<letters.length(); i++){
            temp.add(letters.charAt(i));                                    //将字母一个一个取出来放进temp里面
            getString(digits.substring(1), temp, result, map);
            temp.remove(temp.size()-1);                                     //删掉temp里面的最后一个
        }
    }
}
