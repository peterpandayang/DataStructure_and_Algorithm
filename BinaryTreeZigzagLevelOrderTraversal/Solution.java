package BinaryTreeZigzagLevelOrderTraversal;

/**
 * Created by bingkunyang on 16/1/17.
 */

import java.util.*;


class TreeNode {
    public int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return rst;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> items = new ArrayList<Integer>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                items.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (reverse) {
                Collections.reverse(items);
            }
            rst.add(items);
            reverse ^= true;
        }
        return rst;
    }
}