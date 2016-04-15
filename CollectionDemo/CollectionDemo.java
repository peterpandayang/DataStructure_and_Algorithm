package CollectionDemo;

import java.util.Stack;


/**
 * Created by bingkunyang on 15/12/2.
 */
public class CollectionDemo {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
