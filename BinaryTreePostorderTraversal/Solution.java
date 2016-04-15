package BinaryTreePostorderTraversal;
import java.util.ArrayList;
/**
 * Created by bingkunyang on 16/1/16.
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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        if(root == null) return arraylist;

        arraylist.addAll(postorderTraversal(root.left));
        arraylist.addAll(postorderTraversal(root.right));
        arraylist.add(root.val);

        return arraylist;
    }
}


//public class Solution {
//    /**
//     * @param root: The root of binary tree.
//     * @return: Postorder in ArrayList which contains node values.
//     */
//    public ArrayList<Integer> postorderTraversal(TreeNode root) {
//        // write your code here
//        ArrayList<Integer> arraylist = new ArrayList<Integer>();
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode prev = null; // previously traversed node
//        TreeNode curr = root;
//
//        if (root == null) {
//            return arraylist;
//        }
//
//        stack.push(root);
//        while(!stack.empty()){
//            curr = stack.peek();
//            if(prev == null || prev.left == curr ||prev.right == curr){
//                if(curr.left != null){
//                    stack.push(curr.left);
//                }else if(curr.right != null){
//                    stack.push(curr.right);
//                }
//            } else if(curr.left == prev){
//                if(curr.right != null){
//                    stack.push(curr.right);
//                }
//            } else{
//                arraylist.add(curr.val);
//                stack.pop();
//            }
//            prev = curr;
//        }
//
//        return arraylist;
//    }
//}






