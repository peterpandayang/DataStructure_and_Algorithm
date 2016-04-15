package ReverseSortedList;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
/**
 * Created by bingkunyang on 16/1/12.
 */


public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        Stack<Integer> stack = new Stack<Integer>();
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        while(!stack.isEmpty()){
            ListNode newNode = new ListNode(stack.pop());
            p.next = newNode;
            p = p.next;
        }
        return dummyNode.next;
    }
}