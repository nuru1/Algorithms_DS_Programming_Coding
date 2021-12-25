package leetCode.conest.June;

public class DeleteNodeLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		ListNode node = new ListNode(4);
		node.next = new ListNode(5);
		node.next.next = new ListNode(1);
		node.next.next.next = new ListNode(9);

		printLinkedList(node);

		deleteNode(node.next.next);
		System.out.println("");
		printLinkedList(node);
	}

	public static void deleteNode(ListNode node) {

		if (node.next == null)
			node = null;

		node.val = node.next.val;
		node.next = node.next.next;

	}

	private static void printLinkedList(ListNode node) {
		if (node == null)
			return;
		System.out.print(" -> " + node.val);
		printLinkedList(node.next);
	}
}
