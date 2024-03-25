package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;

public class MergeTwoSortedList {

    private final boolean loop;

    public MergeTwoSortedList(boolean loop) {
        this.loop = loop;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return loop ? loop(list1, list2) : recursive(list1, list2);
    }

    private ListNode recursive(ListNode f, ListNode s) {
        if (f == null) {
            return s;
        }

        if (s == null) {
            return f;
        }

        if (f.val <= s.val) {
            f.next = mergeTwoLists(f.next, s);
            return f;
        } else {
            s.next = mergeTwoLists(f, s.next);
            return s;
        }
    }

    private ListNode loop(ListNode f, ListNode s) {
        ListNode head = new ListNode();
        ListNode current = head;

        while (f != null && s != null) {
            if (f.val <= s.val) {
                current.next = f;
                f = f.next;
            } else {
                current.next = s;
                s = s.next;
            }
            current = current.next;
        }

        if (f != null) {
            current.next = f;
        }
        if (s != null) {
            current.next = s;
        }

        return head.next;
    }
}
