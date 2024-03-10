package org.example.datastructure.list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int[] vals) {
        return from(vals, 0);
    }

    private static ListNode from(int[] vals, int idx) {
        if (idx >= vals.length) {
            return null;
        }

        var node = new ListNode(vals[idx]);
        node.next = ListNode.from(vals, idx + 1);

        return node;
    }
}
