package com.algorithm;

public class Question2 {
    int sum = 0;
    public int addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        //int sum = 0;

        helper(cur, l1, l2, 0);

        return sum;
    }


    public void helper(ListNode cur, ListNode l1, ListNode l2, int sum){

        if(l1 == null && l2 == null){
            if(sum > 0){
                cur.next = new ListNode(sum);
            }
        }

        if(l1 != null){
            sum = sum + l1.val;
            l1 = l1.next;
        }

        if(l2 != null){
            sum = sum + l2.val;
            l2 = l2.next;
        }

        cur.next = new ListNode(sum % 10);
        cur = cur.next;

        helper(cur, l1, l2, sum/10);
    }
}
