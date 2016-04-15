package RemoveDuplicateFromSortedList2;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

}
/**
 * Created by bingkunyang on 16/1/12.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        ListNode dummyNode  = new ListNode(0);
        dummyNode.next = head;
        ListNode p = dummyNode;

        while(p.next != null && p.next.next != null) {
            if (p.next.val == p.next.next.val) {
                int val = p.next.val;
                while (p.next != null && p.next.val == val) {
                    p.next = p.next.next;
                }
            }else {
                p = p.next;
            }
        }
        return dummyNode.next;
    }
}