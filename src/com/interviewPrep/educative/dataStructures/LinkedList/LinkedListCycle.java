package com.interviewPrep.educative.dataStructures.LinkedList;

import com.interviewPrep.models.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null || fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
