package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

//   Recursivly
    ListNode newHead;

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        reverseListService(head);
        return newHead;
    }
    public ListNode reverseListService (ListNode head) {
        if (head.next == null) {
            newHead = head;
            return head;
        }
        ListNode rtnNode =  reverseListService (head.next);
        head.next = null;
        rtnNode.next = head;
        return head;
    }



//    Iteratively
    /*public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        Stack<ListNode> listStack = new Stack<>();
        while (head != null) {
            listStack.push(head);
            head = head.next;
        }
        head  = listStack.pop();
        ListNode returnNode = head;
        while (!listStack.isEmpty()) {
            head.next = listStack.pop();
            head = head.next;
            head.next = null;
        }
        return returnNode;
    }*/




//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        Stack<ListNode> stackedList = new Stack<>();
//
//        while (head != null) {
//                stackedList.push(head);
//                head = head.next;
//        }
//        ListNode currentNode = stackedList.pop();
//        head = currentNode;
//        while (!stackedList.isEmpty()) {
//            currentNode.next = stackedList.pop();
//            currentNode = currentNode.next;
//            currentNode.next = null;
//        }
//        return head;
//    }
}
