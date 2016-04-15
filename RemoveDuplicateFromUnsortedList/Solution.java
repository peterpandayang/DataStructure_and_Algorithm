package RemoveDuplicateFromUnsortedList;

import java.util.HashSet;
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;

    }
}
/**
 * Created by bingkunyang on 15/12/31.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: head node
     */
    public ListNode removeDuplicates(ListNode head) {
        // Write your code here
        HashSet<Integer> hash = new HashSet<Integer>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null) {
            if (hash.contains(head.next.val)) {
                head.next = head.next.next;
            } else {
                hash.add(head.next.val);
                head = head.next;
            }
        }

        return dummy.next;
    }
}