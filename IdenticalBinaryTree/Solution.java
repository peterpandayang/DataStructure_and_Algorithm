package IdenticalBinaryTree;

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
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if (a == null && b == null){
            return true;
        }else if (a == null || b == null){
            return false;
        }
        if (a.val != b.val){
            return false;
        }else{                      //根相同
            //左右子树分别相同
            return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
        }
    }
}
