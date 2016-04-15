package ConvertSortedListtoBalancedBST;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bingkunyang on 16/1/20.
 */

class TreeNode {
    public int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;

    }
}

public class Solution {


    private ListNode current;

    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        current = head;
        size = getListLen(head);
        TreeNode result = helper(size);
        printTree(result);
        return result;
    }

    private int getListLen(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    private TreeNode helper(int size) {
        if (size <= 0) {
            return null;
        }

        TreeNode left = helper(size / 2);
        TreeNode root = new TreeNode(current.val);
        current = current.next;
        TreeNode right = helper(size - size / 2 - 1);
        root.left = left;
        root.right = right;
        return root;
    }

    private void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);

    }

    public static void main (String[] args) {
        Solution test = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        test.sortedListToBST(node1);
    }


//    public int getListLength(ListNode head){
//        int size = 0;
//        while(head != null){
//            size++;
//            head = head.next;
//        }
//        return size;
//    }
//
//    public TreeNode sortedListToBST(ListNode head){
//        int size = 0;
//
//        current = head;
//        size = getListLength(head);
//        return sortedListToBSTHelper(size);
//    }
//
//    public TreeNode sortedListToBSTHelper(int size) {
//        if (size <= 0){
//            return null;
//        }
//
//        TreeNode left = sortedListToBSTHelper(size/2);
//        TreeNode root = new TreeNode(current.val);
//        current = current.next;
//        TreeNode right = sortedListToBSTHelper(size - size/2 - 1);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

}

