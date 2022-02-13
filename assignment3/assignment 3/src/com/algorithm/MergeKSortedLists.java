package com.algorithm;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(-1);
        ListNode head = new ListNode(-1);

        dummy.next = head;


        if(lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode list : lists) {
            if(list == null) {
                continue;
            }
            pq.offer(list);
        }

        while(!pq.isEmpty()) {

            ListNode cur = pq.poll();


            head.next = cur;
            head = head.next;
            cur = cur.next;

            if(cur == null) {
                continue;
            }

            pq.offer(cur);
        }

        return dummy.next.next;

    }
}
