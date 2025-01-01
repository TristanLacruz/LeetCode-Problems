
public class Middle_of_the_Linked_List {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		ListNode middle = middleNode(head);

		printList(middle);
	}

	public static ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode end = head;
		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;
		}
		return middle;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " -> ");
			node = node.next;
		}
		System.out.println("end");
	}
}
