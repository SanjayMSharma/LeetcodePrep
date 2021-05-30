package com.interviewPrep.educative.dataStructures.LinkedList;

import com.interviewPrep.models.ListNode;

public class LinkedListCycleLength {
    public int findCycleLength(ListNode head) {
        if (head == null || head.next== null) return 1;
        ListNode slow = head;
        ListNode fast = head.next;
        int cycleCounter = 0;

        while (fast != null || fast.next != null) {
            if (fast == slow) {
                ListNode counterNode = slow.next;
                cycleCounter++;
                while (counterNode != slow) {
                    counterNode = counterNode.next;
                    cycleCounter++;
                }
                return cycleCounter;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return cycleCounter;
    }
}
