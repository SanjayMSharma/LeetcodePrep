package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class LinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        int addedBinary = head.val;
        if (head.next == null) return addedBinary;
        head = head.next;
        while (head != null) {
            addedBinary = (addedBinary * 10) + head.val;
            head = head.next;
        }
        String binaryString = String.valueOf(addedBinary);
        return Integer.parseInt(binaryString, 2);
    }
}
