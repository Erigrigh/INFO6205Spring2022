package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        Node dummy = new Node(-1);
        Node cur = dummy;

        Map<Node, Node> map = new HashMap<>();

        while (head != null) {

            if (!map.containsKey(head)) {
                map.put(head, new Node(head.val));
            }

            cur.next = map.get(head);

            if (head.random != null) {
                if (!map.containsKey(head.random)) {
                    map.put(head.random, new Node(head.random.val));
                }
                cur.next.random = map.get(head.random);
            }

            cur = cur.next;
            head = head.next;
        }

        return dummy.next;
    }
}
