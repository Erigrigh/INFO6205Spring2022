package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesinEvenLengthGroups {
    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        int size = 1;
        while (cur.next != null) {
            int i = 0;

            int j = 0;
            ListNode nextNode = cur.next;
            while (j < size && nextNode != null) {
                j++;
                nextNode = nextNode.next;
            }
            if (j % 2 == 1) {
                while (i++ < size && cur.next != null) {
                    cur = cur.next;
                }
            }
            else {
                ListNode last = cur.next;
                ListNode next = last.next;
                last.next = null;
                while (i++ < size - 1 && next != null) {
                    ListNode tmp = next.next;
                    next.next = last;
                    last = next;
                    next = tmp;
                }
                cur.next = last;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = next;
            }
            size++;
        }
        return dummy.next;

    }

}
