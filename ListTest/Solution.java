package ListTest;

import java.util.Stack;

/**
 * Created by bingkunyang on 15/12/30.
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

    public ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
        int Int1 = ListToInteger(l1);
        int Int2 = ListToInteger(l2);



        int Sum = Int1 + Int2;
        System.out.println(Sum);
        return IntegerToList(Sum);
    }

    private int ListToInteger(ListNode p){
        int carry = 0, digit = 0;
        while(p != null){
            carry = p.val;
            digit = digit * 10 + carry;
            p = p.next;
        }
        return digit;
    }

    private ListNode IntegerToList(int digit){
        ListNode dummyNode = new ListNode(0);
//        ListNode p = dummyNode;
        int carry = 0;
        while(digit != 0){
            carry = digit % 10;
            ListNode newNode = new ListNode(carry);
            newNode.next = dummyNode.next;
            dummyNode.next = newNode;
            digit = digit / 10;
        }
        return dummyNode.next;
    }



    public static void main(String[] args){
//        ListNode node1 = new ListNode(0);
//        ListNode node4 = new ListNode(0);

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        Solution answer = new Solution();
        ListNode Node = answer.addLists2(node1, node4);


        ListNode cur = Node;
        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }

    }

//    public ListNode addLists2(ListNode l1, ListNode l2) {
//        if (l1 == null && l2 == null) {
//            return null;
//        } else if (l1 == null || l2 == null) {
//            return l1 == null ? l2 : l1;
//        }
//
//        Stack<ListNode> result = new Stack<ListNode>();
//        Stack<ListNode> s1 = new Stack<ListNode>();
//        Stack<ListNode> s2 = new Stack<ListNode>();
//
//        while (l1 != null) {
//            s1.push(l1);
//            l1 = l1.next;
//        }
//
//        while (l2 != null) {
//            s2.push(l2);
//            l2 = l2.next;
//        }
//
//        int carrier = 0;
//        while(!s1.isEmpty() || !s2.isEmpty()){
//            int sum = 0;
//            if (!s1.isEmpty() && !s2.isEmpty()) {
//                sum += s1.pop().val + s2.pop().val;
//            } else if (!s1.isEmpty()) {
//                sum += s1.pop().val;
//            } else {
//                sum += s2.pop().val;
//            }
//            result.push(new ListNode((sum + carrier) % 10));//2, 1, 9
//            carrier = (sum + carrier) / 10; // 12/10 = 1; 11/10 = 1; (8+1)/ 10 = 0
//        }
//        if (carrier == 1) {
//            result.push(new ListNode(carrier));
//        }
//
//        //return results:
//        ListNode node = new ListNode(0);
//        ListNode dummy = node;
//        while (!result.isEmpty()) {//219
//            node.next = result.pop();
//            node = node.next;
//        }
//
//        return dummy.next;
//    }
}

