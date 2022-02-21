package com.algorithm;

import java.util.List;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        dummy1.next = l1;
        dummy2.next = l2;

        while(head != null) {
            if(head.val < x) {
                l1.next = head;
                l1 = l1.next;
            }
            else {
                l2.next = head;
                l2 = l2.next;
            }

            head = head.next;
        }

        l1.next = dummy2.next.next;
        l2.next = null;
        return dummy1.next.next;
    }
}
