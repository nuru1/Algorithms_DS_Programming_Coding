package leetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers_LinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int a = 0, b = 0, c = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            c = a + b + carry;
            carry = c / 10;
            c = c % 10;

            System.out.println("a=" + a + " b=" + b + " c=" + c + " carry=" + carry);

            node.next = new ListNode(c);

            node = node.next;
        }

        if (carry == 1) {
            node.next = new ListNode(1);
        }

        return head.next;
    }
}
