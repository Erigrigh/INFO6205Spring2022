package com.algorithm;

public class InsertIntoASortedCircularLinkedList {

    public Node insert(Node head, int insertVal) {

        if(head == null) {
            Node insert = new Node(insertVal);
            insert.next = insert;
            return insert;
        }

        Node cur = head;
        while ( cur.next != head ) {
            if(cur.val <= insertVal && cur.next.val >= insertVal) {
                Node insert = new Node(insertVal);
                insert.next = cur.next;
                cur.next = insert;
                return head;
            }

            if(cur.next.val < cur.val) {

                if(cur.val <= insertVal) {
                    Node insert = new Node(insertVal);
                    insert.next = cur.next;
                    cur.next = insert;
                    return head;
                }
                if(cur.next.val >= insertVal) {
                    Node insert = new Node(insertVal);
                    insert.next = cur.next;
                    cur.next = insert;
                    return head;
                }

            }
            cur = cur.next;
        }

        Node insert = new Node(insertVal);
        insert.next = cur.next;
        cur.next = insert;
        return head;
    }
}
