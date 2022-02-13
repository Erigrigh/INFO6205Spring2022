package com.algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        ListNode cur = head;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while(cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        int[] res = new int[list.size()];

        for (int i = 0 ;i < list.size(); i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.peek()] = nums[i];
                stack.pop();
            }
            stack.push(i);
        }

        return res;
    }
}
