package com.algorithm;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        while(n > 0) {
            first = first.next;
            n--;
        }

        while(first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;


        return dummy.next;
    }
}
