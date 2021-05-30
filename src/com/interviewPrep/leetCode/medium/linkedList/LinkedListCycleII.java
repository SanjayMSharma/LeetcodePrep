package com.interviewPrep.leetCode.medium.linkedList;

import com.interviewPrep.models.ListNode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head.next;
        while (null != fast && fast.next != null) {
            if (fast == slow) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null || fast.next == null) return null;
        int totalCycleCount = 1;
        fast = slow.next;
        while (fast != slow) {
            fast = fast.next;
            totalCycleCount++;
        }
        fast = head;
        slow = head;
        for (int counter = 0; counter < totalCycleCount; counter++) {
            fast = fast.next;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
