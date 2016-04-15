package BinaryTreeLevelOrderTraversal2;
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
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int curlevelnum = 1;
        int nextlevelnum = 0;

        while(curlevelnum != 0){
            ArrayList<Integer> curlevelresult = new ArrayList<Integer>();
            nextlevelnum = 0;
            while(curlevelnum != 0){
                TreeNode node = queue.poll();
                curlevelnum --;
                curlevelresult.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                    nextlevelnum ++;
                }
                if(node.right != null){
                    queue.offer(node.right);
                    nextlevelnum ++;
                }
            }
            curlevelnum = nextlevelnum;
            result.add(0, curlevelresult);
        }
        return result;
    }
}











