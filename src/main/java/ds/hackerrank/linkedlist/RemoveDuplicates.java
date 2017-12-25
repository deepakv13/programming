package ds.hackerrank.linkedlist;

public class RemoveDuplicates {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node head = insert(null, 1, 0);
		head = insert(head, 1, 1);
		head = insert(head, 3, 2);
		head = insert(head, 3, 3);
		head = insert(head, 5, 4);
		head = insert(head, 6, 5);
		print(head);
		System.out.println();
		Node newHead = removeDuplicates(head);
		print(newHead);
	}
	
	private static Node removeDuplicates(Node head) {
		if (head == null) {
			return null;
		}
		Node a = head;
		Node b = head.next;
		while (b != null) {
			if (a.data == b.data) {
				a.next = b.next;
				b = b.next;
			}
			else {
				a = b;
				b = b.next;
			}
		}
		return head;
	}

	public static Node insert(Node head, int data, int position) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (position == 0) {
			newNode.next = head;
			return newNode;
		}
		
		Node current = head;
		while (--position > 0) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		
		return head;
	}
	
	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}

}
