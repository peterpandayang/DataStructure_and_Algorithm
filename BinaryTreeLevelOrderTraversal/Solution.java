package BinaryTreeLevelOrderTraversal;
import java.util.*;
/**
 * Created by bingkunyang on 16/1/17.
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
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root == null){
            return result;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode head = queue.poll();
                level.add(head.val);

                if(head.left != null){
                    queue.offer(head.left);
                }
                if(head.right != null){
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}














