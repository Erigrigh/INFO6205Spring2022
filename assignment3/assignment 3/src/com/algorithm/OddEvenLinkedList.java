package com.algorithm;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode evenStrat = new ListNode(-1);
        evenStrat = head.next;

        while (odd.next != null && odd.next.next != null) {

            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }


        odd.next = evenStrat;

        return dummy.next;
    }
}
