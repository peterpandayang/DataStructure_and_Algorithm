package flattenBinaryTreeToList;

/**
 * Created by bingkunyang on 15/12/2.
 */

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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode p = root;

        while(p != null || !stack.empty()){
            if (p.right != null){
                stack.push(p.right);
            }
            if (p.left != null){
                p.right = p.left;
                p.left = null;
            }
            else if (!stack.empty()){
                TreeNode temp = stack.pop();
                p.right = temp;
            }
            p = p.right;
        }

    }
}