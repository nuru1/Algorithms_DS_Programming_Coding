package leetCode.LinkedList;

// https://leetcode.com/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class LinkedListAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode tail = l3;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int d1 = l1 != null ? l1.val : 0;
            int d2 = l2 != null ? l2.val : 0;
            
            int sum = d1 + d2 + carry;
            System.out.println (d1 + " + "+ d2 + " = " + sum + " : "+ carry);
            
            carry = sum / 10;
            sum = sum % 10;

            ListNode temp = new ListNode(sum);
            tail.next = temp;
            tail = tail.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        l3 = l3.next;
        return l3;
    }
}