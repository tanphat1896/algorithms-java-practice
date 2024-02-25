package org.example.datastructure.stack;

public class MinStack {

    private record Node(Node next, int val, int min) {
    }

    private Node head;

    public MinStack() {
    }

    public void push(int val) {
        head = new Node(head, val, head == null ? val : Math.min(head.min, val));
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head == null ? 0 : head.val;
    }

    public int getMin() {
        return head.min;
    }
}

