package com.algorithm;

public class Node {
    public int val;
    public Node next;
    Node random;

    public Node() {}

//    public Node(int val) {
//        this.val = val;
//    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
