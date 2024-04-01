package leetCode.LinkedList;

public class RemoveNthNodeEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        int count = 0;
        while (tail != null){
            count++;
            tail = tail.next;
        }
        if(count-n == 0)
            return head.next;
        ListNode t1 = head;
        for (int i=1; i<=count-n-1; i++){
            t1 = t1.next;
        }
        t1.next = t1.next.next;
        return head;
    }
}
