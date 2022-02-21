package com.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int count = 0;
        if(set.contains(head.val)) {
            count = 1;
        }

        while(head.next != null) {
            if(!set.contains(head.val) && set.contains(head.next.val)) {
                count++;
            }
            head = head.next;
        }

        return count;
    }
}
