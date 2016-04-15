package BalancedBinaryTree;

/**
 * Created by bingkunyang on 16/1/1.
 */

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
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null){
            return true;
        }
        if (!isBalanced(root.left)){        //左子树不平衡
            return false;
        }
        if (!isBalanced(root.right)){       //右子树不平衡
            return false;
        }
        int delta = getHeight(root.left) - getHeight(root.right);
        return delta >= -1 && delta <=1;
    }

    private int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

}