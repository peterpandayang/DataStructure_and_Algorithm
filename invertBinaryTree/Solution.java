package invertBinaryTree;

/**
 * Created by bingkunyang on 15/12/3.
 */
/**
 * Definition of TreeNode:
 *
 */

class TreeNode {
    public int val;
    public TreeNode left, right;
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
    public void invertBinaryTree(TreeNode root) {
        if (root != null){
            helper(root);
        }
        return;
    }

    public void helper(TreeNode p){
        TreeNode temp = new TreeNode(0);
        temp = p.left;
        p.left = p.right;
        p.right = temp;

        if (p.right != null){
            helper(p.right);
        }
        if (p.left != null){
            helper(p.left);
        }
    }
}