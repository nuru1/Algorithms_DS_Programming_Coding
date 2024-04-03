package leetCode.LinkedList;

/**
 * PartitionList
 */
public class PartitionList {
// https://leetcode.com/problems/partition-list/?envType=study-plan-v2&envId=top-interview-150
    public ListNode partition(ListNode head, int x) {

        ListNode n = new ListNode(0);
        ListNode t = head, t2 = n;

        while (t != null){
            if(t.val < x){
                ListNode temp = new ListNode(t.val);
                t2.next = temp;
                t2 = temp;
            }
            t = t.next;
        }
        t = head;
        while (t != null){
            if(t.val >= x){
                ListNode temp = new ListNode(t.val);
                t2.next = temp;
                t2 = temp;
            }
            t = t.next;
        }
        return n.next;
    }
}