package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slowCounter = head;
        ListNode fastCounter = head;
        while (fastCounter != null) {
            if (fastCounter == slowCounter) return true;
            slowCounter = slowCounter.next;
            fastCounter = (fastCounter.next != null ) ? fastCounter.next.next : null;
        }
        return false;
    }
}
