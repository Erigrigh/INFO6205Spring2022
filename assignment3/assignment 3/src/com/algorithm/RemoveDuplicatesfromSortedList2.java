package com.algorithm;

public class RemoveDuplicatesfromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;

        int size = 0;
        ListNode count = dummy;
        while(count.next != null) {
            count = count.next;
            size++;
        }

        for(int i = 0; i < size; i ++) {

            if(fast == null || fast.next == null) {
                break;
            }

            if(fast.val != fast.next.val){
                fast = fast.next;
                slow = slow.next;
                continue;
            }

            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }

            fast = fast.next;
            slow.next = fast;


        }

        return dummy.next;
    }
}
