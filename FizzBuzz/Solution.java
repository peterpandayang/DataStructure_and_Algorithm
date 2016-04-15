package FizzBuzz;
import java.util.ArrayList;
/**
 * Created by bingkunyang on 15/12/30.
 */
class Solution {
    /**
     * param n: As description.
     * return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<String>();
        //starts from 1
        for (int i = 1 ; i <= n ; i++){
            if (i % 15 == 0){
                results.add("fizz buzz");
            }
            else if (i % 5 == 0){
                results.add("buzz");
            }
            else if (i % 3 == 0 ){
                results.add("fizz");
            }
            else {
                results.add(String.valueOf(i));
            }

        }
        return results;
    }
}