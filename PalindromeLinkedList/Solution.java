package PalindromeLinkedList;

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
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }

        ListNode p = head;
        ListNode prev = new ListNode(head.val);
                                                                //将链表调转过来
        while(p.next != null){
            ListNode temp = new ListNode(p.next.val);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }
                                                                //比较每一个节点的值
        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1.next != null){
            if (p1.val != p2.val){
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}