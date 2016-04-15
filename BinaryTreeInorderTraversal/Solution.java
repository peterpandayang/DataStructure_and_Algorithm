package BinaryTreeInorderTraversal;

/**
 * Created by bingkunyang on 16/1/16.
 */
import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    public int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode cur = root;

        while(cur != null || !stack.empty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            stack.pop();
            arraylist.add(cur.val);
            cur = cur.right;

        }
        return arraylist;
    }
}






