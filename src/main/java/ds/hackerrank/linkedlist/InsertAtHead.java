package ds.hackerrank.linkedlist;

public class InsertAtHead {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node one = insert(null, 1);
		Node two = insert(one, 2);
		Node three = insert(two, 3);
		Node four = insert(three, 4);
		print(four);
	}
	
	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}

	public static Node insert(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (head == null) {
			return newNode;
		}
		else {
			newNode.next = head;
			return newNode;
		}
	}
}
