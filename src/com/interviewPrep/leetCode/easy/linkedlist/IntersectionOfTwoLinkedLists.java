package com.interviewPrep.leetCode.easy.linkedlist;

import com.interviewPrep.models.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode firstList = headA;
        ListNode secondList = headB;

        while (firstList != secondList) {
            if (null != firstList)
                firstList = firstList.next;
            else firstList = headB;
            if (null != secondList)
                secondList = secondList.next;
            else secondList = headA;
        }
        return firstList;
    }

/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Edge case
        if (headA == null || headB == null) return null;
        ListNode firstList = headA;
        ListNode secondList = headB;
        ListNode listALast = null;
        ListNode listBLast = null;
        while (firstList != secondList) {
            if (listALast != null && listBLast != null)
                if (listALast != listBLast) return null;

            firstList = (firstList == null) ? headB : firstList.next;
            secondList = (secondList == null) ? headA : secondList.next;

            if (null != firstList && firstList.next == null) listALast = firstList;
            if (null != secondList && secondList.next == null) listBLast = secondList;

        }
        return firstList;
    }*/
}

