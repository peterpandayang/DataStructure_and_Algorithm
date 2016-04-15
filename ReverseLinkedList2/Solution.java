package ReverseLinkedList2;

/**
 * Created by bingkunyang on 16/1/24.
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
    public ListNode reverseBetween(ListNode head, int m, int n) {

        //judge if the list is null or the list only contains one node

        if(head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode preNode = dummyNode;
        int location = 1;

        //judge if the node is in the range

        while (preNode.next != null && location < m) {
            preNode = preNode.next;
            location++;
        }

        ListNode startNode = preNode.next;
        ListNode curNode = startNode.next;

        if(location < m) {
            return head;
        }

        while (curNode != null && location < n) {
            ListNode next = curNode.next;
            curNode.next = preNode.next;
            preNode.next = curNode;
            startNode.next = next;
            curNode = next;
            location++;
        }
        return dummyNode.next;
    }
}
