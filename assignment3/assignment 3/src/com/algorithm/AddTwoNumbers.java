package com.algorithm;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode  cur = dummy;
        int sum = 0;

        while ( l1 != null || l2!= null) {

            int a = 0;
            int b = 0;

            if(l1 != null) {
                a = l1.val;
            }
            if(l2 != null) {
                b = l2.val;
            }


            sum = a + b + sum;
            cur.next = new ListNode(sum % 10);
            sum= sum / 10;
            cur = cur.next;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(sum > 0) {
            cur.next = new ListNode(sum);
        }
        return dummy.next;
    }
}
