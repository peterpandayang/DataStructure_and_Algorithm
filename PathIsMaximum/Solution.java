package PathIsMaximum;

import java.net.Socket;

/**
 * Created by bingkunyang on 16/2/4.
 */

class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    public TreeNode (int val) {
        this.val = val;
        this.left = this.right = null;
    }
}


public class Solution {
    public int getMax (TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        return cur.val + Math.max(getMax(cur.left), getMax(cur.right));
    }

    public static void main (String[] args) {
        Solution test = new Solution();
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.print(test.getMax(root));
    }

}
