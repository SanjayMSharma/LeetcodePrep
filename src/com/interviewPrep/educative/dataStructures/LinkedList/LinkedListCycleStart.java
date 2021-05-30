package com.interviewPrep.educative.dataStructures.LinkedList;

import com.interviewPrep.models.ListNode;

public class LinkedListCycleStart {
    int cycleCounter = 0;
    ListNode head;
    public ListNode findCycleStart(ListNode head) {
        if ((head == null || head.next == null)) return null;
        this.head = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return findCycleNode(slow);
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }

    public ListNode findCycleNode (ListNode slow) {
        ListNode currentNode = slow.next;
        cycleCounter++;
        while (currentNode != slow) {
            cycleCounter++;
            currentNode = currentNode.next;
        }
        ListNode primaryNode = head;
        ListNode secondryNode = head;
        for (int counter = 0; counter < cycleCounter; counter++) {
            secondryNode = secondryNode.next;
        }
        while (primaryNode != secondryNode) {
            primaryNode = primaryNode.next;
            secondryNode = secondryNode.next;
        }
        return primaryNode;
    }
}
