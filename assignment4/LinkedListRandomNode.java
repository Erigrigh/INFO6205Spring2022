package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {

    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    // the class name on leetcode is Solution,
    // so I have to change the name of the constructor into Solution
    // please only copy the code content of the constructor below to avoid problem
    // when test my code on leecode
    // thank you

    public LinkedListRandomNode(ListNode head) {
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        int i = random.nextInt(list.size());
        int res = 0;
        res = list.get(i);
        return res;
    }
}
