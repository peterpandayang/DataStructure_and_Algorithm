package FindNumandMaxinBST;

/**
 * Created by bingkunyang on 16/1/24.
 */

class Node {
    public int val;
    Node left, right;
    public Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Solution {

    public int findMinimum(){
        Node root = new Node(0);
        if ( root == null ){
            return 0;
        }
        Node currNode = root;
        while(currNode.left != null){
            currNode = currNode.left;
        }
        return currNode.val;
    }

    public int findMaximum(){
        Node root = new Node(0);
        if ( root == null){
            return 0;
        }
        Node currNode = root;
        while(currNode.right != null){
            currNode = currNode.right;
        }
        return currNode.val;}

}
