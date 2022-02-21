package com.algorithm;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode nodeL = head;
        ListNode nodeR = head;
        ListNode prev = dummy;
        int n = 1;
        int m = 1;
        while(n < left){
            nodeL = nodeL.next;
            prev = prev.next;
            n++;
        }

        while(m <= right) {
            nodeR = nodeR.next;
            m++;
        }
        ListNode after = prev.next;
        prev.next = reverse(nodeL, nodeR);
        after.next = nodeR;

        return dummy.next;
    }

    public ListNode reverse(ListNode node, ListNode nodeRight) {

        ListNode pre = null;
        while(node != nodeRight) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
