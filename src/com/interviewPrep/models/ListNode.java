package com.interviewPrep.models;

public class ListNode {
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
