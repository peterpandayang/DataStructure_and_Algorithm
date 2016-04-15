package swapNodeInPairs;

/**
 * Created by bingkunyang on 15/12/1.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode ptr1 = dummyNode;
        ListNode ptr2 = head;

        while(ptr2 != null && ptr2.next != null){
            ListNode startNode = ptr2.next.next;        //设置每次调换的pair的第一个node
//            ptr2.next.next = ptr2;                      //调换node
//            ptr1.next = ptr2.next;                      //和之前的node接上
//            ptr2.next = startNode;                      //和后面的node接上
//            ptr1 = ptr2;
//            ptr2 = ptr2.next;
            ptr1.next = ptr2.next;
            ptr1.next.next = ptr2;
            ptr2.next = startNode;
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;
        }
        return dummyNode.next;

    }
}