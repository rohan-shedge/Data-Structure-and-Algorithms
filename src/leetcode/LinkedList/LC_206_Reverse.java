package leetcode.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC_206_Reverse {
    @Test
    public void test() {
        LC_206_Reverse test = new LC_206_Reverse();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node = test.reverseList(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    //iterative
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }

     //recursive
    public ListNode reverseList_recursive(ListNode head) {
        if (head == null) return  null;
        ListNode temp = reverseList_recursive(head.next);
        temp.next = head;
        return head;
    }
}
