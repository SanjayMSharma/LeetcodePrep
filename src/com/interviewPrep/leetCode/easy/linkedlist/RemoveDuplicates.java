package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val)
                currentNode.next = currentNode.next.next;
            else
                currentNode = currentNode.next;
        }
        return head;
    }
}
