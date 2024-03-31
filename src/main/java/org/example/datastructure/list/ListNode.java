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

    public static ListNode makeCycleList(int[] vals, int cycleIdx) {
        var head = from(vals, 0);
        ListNode current = head, cycleNode = null, tail = null;
        for (int i = 0; current != null; current = current.next, i++) {
            if (cycleIdx == i) {
                cycleNode = current;
            }
            if (current.next == null) {
                tail = current;
            }
        }

        if (tail != null) {
            tail.next = cycleNode;
        }

        return head;
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
