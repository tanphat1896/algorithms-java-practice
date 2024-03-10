package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null,
            curr = head,
            next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseListUsingRecursive(ListNode head) {
        if (head == null) {
            return null;
        }

        return reverse(head, null);
    }

    public ListNode reverse(ListNode node, ListNode prev) {
        if (node.next == null) {
            node.next = prev;
            return node;
        }

        var next = node.next;
        node.next = prev;

        return reverse(next, node);
    }

    public ListNode reverseListUsingRecursive2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // recursively reverse on next node to avoid breaking list
        ListNode newHead = reverseListUsingRecursive2(head.next);

        // next node of current node will reference to itself
        head.next.next = head;

        // remove old reference to avoid circular
        head.next = null;

        return newHead;
    }
}
