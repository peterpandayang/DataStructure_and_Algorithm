package IntersectionOfTwoLinkedList;

import java.util.Stack;
import java.util.HashSet;

/**
 * Created by bingkunyang on 16/1/15.
 */
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;

    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if(headA == null || headB == null)
            return null;

        HashSet<ListNode> setA = new HashSet<ListNode>();

        while(headA != null) {
            setA.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(setA.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;

    }
}

//public class Solution {
//    /**
//     * @param headA: the first list
//     * @param headB: the second list
//     * @return: a ListNode
//     */
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        // Write your code here
//        Stack<Integer> stackA = new Stack<Integer>();
//        Stack<Integer> stackB = new Stack<Integer>();
//
//        if(headA ==null || headB == null){
//            return null;
//        }
//
//        while(headA.next != null){
//            stackA.push(headA.val);
//        }
//        while(headB.next != null){
//            stackB.push(headB.val);
//        }
//
//        Stack<Integer> stack = stackA;
//        int val = 0;
//        boolean flag = false;
//
//        while(stackA.pop() == stackB.pop()){
//            flag = true;
//            val = stack.pop();
//        }
//        if(flag){
//            ListNode Node = new ListNode(val);
//            return Node;
//        }
//        return null;
//    }
//}

































