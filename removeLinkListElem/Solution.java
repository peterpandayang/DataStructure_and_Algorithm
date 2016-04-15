package removeLinkListElem;

/**
 * Created by bingkunyang on 15/11/30.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyNode = new ListNode(0);
        ListNode curNode = dummyNode;
        dummyNode.next = head;

        while(curNode.next != null){
            if (curNode.next.val == val){
                curNode.next = curNode.next.next;
            }
            else{
                curNode = curNode.next;
            }
        }
        return dummyNode.next;
    }
}
