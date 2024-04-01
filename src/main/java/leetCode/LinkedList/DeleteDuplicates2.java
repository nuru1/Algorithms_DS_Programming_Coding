package leetCode.LinkedList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/1219652628/?envType=study-plan-v2&envId=top-interview-150
public class DeleteDuplicates2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = new ListNode(0, head);
        ListNode prev = t;

        while (head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else
                prev = prev.next;
            head = head.next;
            
        }
        return t.next;
        
    }
}
