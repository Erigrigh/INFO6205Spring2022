package com.algorithm;

public class MaximumTwinSumofaLinkedList {
    public int pairSum(ListNode head) {
        ListNode halfEnd = findHalfEnd(head);
        ListNode rightStart = halfEnd.next;
        halfEnd.next = null;
        ListNode newStart = reverse(rightStart);

        int res = Integer.MIN_VALUE;

        while (head != null) {
            //System.out.println(head.val);
            //System.out.println(newStart.val);
            res = Math.max(head.val + newStart.val, res);

            head = head.next;
            newStart = newStart.next;
        }

        return res;
    }

    public ListNode reverse(ListNode cur) {
        ListNode pre = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode findHalfEnd(ListNode cur) {
        ListNode fast = cur;
        ListNode slow = cur;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
