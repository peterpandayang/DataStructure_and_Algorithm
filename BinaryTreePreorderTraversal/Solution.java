package BinaryTreePreorderTraversal;

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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(root == null)
            return arraylist;

        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            arraylist.add(node.val);

            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);

        }
        return arraylist;

    }
}






