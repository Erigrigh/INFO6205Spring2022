package com.algorithm;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode halfEnd = findHalfEnd(head);
        ListNode rightStart = halfEnd.next;
        halfEnd.next = null;
        ListNode reverseStart = reverse(rightStart);

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;

        if(cur.next == null) {
            cur.next = reverseStart;
            return;
        }

        while(cur.next != null) {
            if(reverseStart.next == null) {
                ListNode first = cur.next;
                cur.next = reverseStart;
                reverseStart.next = first;
                return;
            }
            ListNode next =cur.next;
            ListNode near = reverseStart.next;
            cur.next = reverseStart;
            reverseStart.next = next;
            cur = next;
            reverseStart = near;

            if(reverseStart.next == null && cur.next == null) {
                cur.next = reverseStart;
                return;
            }
            if(reverseStart.next == null && cur.next != null) {
                ListNode last = cur.next;
                cur.next = reverseStart;
                reverseStart.next = last;
                return;
            }
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode findHalfEnd(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
