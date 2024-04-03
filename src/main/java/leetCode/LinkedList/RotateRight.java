package leetCode.LinkedList;

// https://leetcode.com/problems/rotate-list/submissions/1221652913/?envType=study-plan-v2&envId=top-interview-150
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        int size = 1;
        ListNode t = head;
        while (t.next != null){
            size ++;
            t = t.next;
        }
        int rcount = k % size;
        t.next = head;
        for(int i=0; i<size-rcount; i++){
            t = t.next;
        }
        head = t.next;
        t.next = null;
        return head;
    }
}
