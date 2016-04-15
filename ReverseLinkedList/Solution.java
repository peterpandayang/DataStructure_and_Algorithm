package ReverseLinkedList;

/**
 * Created by bingkunyang on 16/2/28.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode reverse(ListNode head) {

        // if the linked list is empty or just have one node
        if(head == null || head.next == null){
            return head;
        }

        ListNode curNode = head;
        ListNode nextNode = head.next;
        head.next = null;

        while(curNode != null){
            ListNode node = nextNode.next;
            nextNode.next = curNode;
            curNode = nextNode;
            if(node == null) {
                break;
            }
            nextNode = node;
        }

        return curNode;
    }


    // recursion
//    public ListNode reverse(ListNode head) {
//        // if the linked list is empty or just have one node
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode node = head.next;
//
//    // supposing that we have obtained the head for the rest of the linked list
//        ListNode newHead = reverse(node);
//
//    // reverse here
//        node.next = head;
//        head.next = null;
//        return newHead;
//    }


}
