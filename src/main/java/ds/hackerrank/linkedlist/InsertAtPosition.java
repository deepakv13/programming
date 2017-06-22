package ds.hackerrank.linkedlist;


public class InsertAtPosition {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node head = insert(null, 1, 0);
		head = insert(head, 2, 1);
		head = insert(head, 5, 2);
		head = insert(head, 3, 2);
		head = insert(head, 4, 3);
		print(head);
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
