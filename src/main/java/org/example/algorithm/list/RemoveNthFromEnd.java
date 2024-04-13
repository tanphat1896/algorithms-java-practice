package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode rmNode = head, end = head, prev = null;
        for (int i = 0; i < n && end != null; i++) {
            end = end.next;
        }

        while (end != null) {
            prev = rmNode;
            rmNode = rmNode.next;
            end = end.next;
        }

        if (prev == null) {
            return head.next;
        }

        prev.next = rmNode.next;

        return head;
    }
}
