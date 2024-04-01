package leetCode.LinkedList;

public class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode(0);
        ListNode tail = l3;

        while (list1 != null && list2!=null){

            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null){
            tail.next = list1;
        }else{
            tail.next = list2;
        }

        l3 = l3.next;
        return l3;
    }
}
