package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class LinkedListMiddle {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = (fastPointer.next.next != null) ? fastPointer.next.next : null;
        }
        return slowPointer;
    }
}
