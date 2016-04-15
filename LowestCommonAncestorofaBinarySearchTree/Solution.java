package LowestCommonAncestorofaBinarySearchTree;

/**
 * Created by bingkunyang on 16/1/18.
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode m = root;

        if(m.val > p.val && m.val < q.val){
            return m;
        }else if(m.val>p.val && m.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(m.val<p.val && m.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}