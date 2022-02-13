package com.algorithm;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode halfEnd = findHalfEnd(head);
        ListNode rightStart = halfEnd.next;

        ListNode reverseStart = reverse(rightStart);

        while(reverseStart != null) {

            //System.out.println(head.val + " " + reverseStart.val);
            if(head.val != reverseStart.val) {
                return false;
            }


            head = head.next;
            reverseStart = reverseStart.next;
        }

        return true;
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
