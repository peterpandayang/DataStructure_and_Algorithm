package binaryTreePath;

/**
 * Created by bingkunyang on 15/12/1.
 */

import java.util.ArrayList;
import java.util.List;

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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {        //results应该是链表
        List<String> result = new ArrayList<String>();
        if (root == null) {
            return result;
        }
        findPaths(root, result, root.val + "");
        return result;
    }

    private void findPaths(TreeNode root, List<String> result, String cur) {
        if (root.left == null && root.right == null) {          //此处输出后要返回
            result.add(cur);
            return;
        }
        if (root.left != null) {
            findPaths(root.left, result, cur + "->" + root.left.val);   //在链表的基础上增加节点
        }
        if (root.right != null) {
            findPaths(root.right, result, cur + "->" + root.right.val);
        }
    }
}
