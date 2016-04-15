package ImplementQueuebyLinkedList;

import java.util.NoSuchElementException;
/**
 * Created by bingkunyang on 16/1/17.
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
    ListNode head;
    ListNode tail;

    public Solution() {

    }

    public void enqueue(int item) {
        if(isEmpty()){
            head = tail = new ListNode(item);
        } else{
            tail.next = new ListNode(item);
            tail = tail.next;
        }
    }

    public int dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            int val = head.val;
            head = head.next;
            return val;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}