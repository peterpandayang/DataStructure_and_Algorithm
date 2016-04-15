package com.company;

import java.util.*;



public class Main {
    public int item;

    public Main next;

    public String toStrings() {
        String result = item + " ";
        if (next != null) {
            result += next.toString();
        }
        return result;
    }

//    public ListNode removeElements(ListNode head, int val) {
//
//        ListNode dummy = new ListNode(1);
//        ListNode i = dummy;
//        ListNode j = head;
//        dummy.next = head;
//
//        while(j != null){
//            if(j.val == val){
//                i.next = i.next.next;
//                j = j.next;
//            }else{
//                i = i.next;
//                j = j.next;
//            }
//        }
//
//        return dummy.next;
//    }
//    ListNode dummy = new ListNode(1);

    public static void main(String[] args) {

        // create a LinkedList
//        LinkedList list = new LinkedList();
        Main list = new Main();

        // add some elements
//        list.add("Hello");
//        list.add("2");
//        list.add("Chocolate");
//        list.add("10");





        Main l1 = new Main();
        Main l2 = new Main();
        Main l3 = new Main();
        l1.item = 1;
        l2.item = 2;
        l3.item = 3;
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        list.item = 11;
//        list.item.next = 12;


        // print the list
        System.out.println("LinkedList:" + list.toStrings());


    }
}
