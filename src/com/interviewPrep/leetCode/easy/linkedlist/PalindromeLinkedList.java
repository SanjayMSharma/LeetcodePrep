package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode remainingList = slow.next;
        ListNode revList = null;
        while (remainingList != null) {
            ListNode tempNode = remainingList;
            remainingList = remainingList.next;
            tempNode.next = revList;
            revList = tempNode;
        }
        ListNode currHead = head;
        while (revList != null) {
            if (currHead.val == revList.val) {
                currHead = currHead.next;
                revList = revList.next;
            } else return false;
        }
        return true;
    }
}
