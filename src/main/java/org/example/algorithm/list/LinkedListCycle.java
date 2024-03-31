package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;

import java.util.HashSet;

public class LinkedListCycle {

    private final boolean fastSlow;

    public LinkedListCycle(boolean fastSlow) {
        this.fastSlow = fastSlow;
    }

    public boolean hasCycle(ListNode head) {
        return fastSlow ? usingFastSlowPointer(head) : usingCheckVisited(head);
    }

    private boolean usingFastSlowPointer(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private boolean usingCheckVisited(ListNode head) {
        var visited = new HashSet<ListNode>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }


}
