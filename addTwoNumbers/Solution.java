package addTwoNumbers;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;

    }
}
/**
 * Created by bingkunyang on 15/12/24.
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = carry + l1.val + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }

        while(l1 != null) {
            int sum =  carry + l1.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l1 = l1.next;
            point = point.next;
        }

        while(l2 != null) {
            int sum =  carry + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l2 = l2.next;
            point = point.next;
        }

        if (carry != 0) {
            point.next = new ListNode(carry);
        }
        return head.next;
    }

//    public ListNode addLists2(ListNode l1, ListNode l2) {
//        ListNode dummyNode = new ListNode(0);
//        ListNode p = l1, q = l2, cur = dummyNode;
//        int carry = 0;
//        while(p != null || q != null){
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int digit = carry + x + y;
//            carry = digit / 10;
//            cur.next = new ListNode(digit);
//            cur = cur.next;
//            if (p != null) p = p.next;
//            if (q != null) q = q.next;
//        }
//        if (carry != 0){
//            cur.next = new ListNode(carry);
//        }
//        return dummyNode.next;

//    }
}


