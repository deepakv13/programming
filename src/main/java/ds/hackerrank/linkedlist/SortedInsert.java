package ds.hackerrank.linkedlist;

public class SortedInsert {
	
	static class Node {
		int data;
		Node prev;
		Node next;
	}
	
	public static void main(String[] args) {
		Node node = sortedInsert(null, 2);
		node = sortedInsert(node, 5);
		node = sortedInsert(node, 4);
		print(node);
		
	}
	
	private static Node sortedInsert(Node head, int data) {
		Node dataNode = new Node();
		dataNode.data = data;
		
		if (head == null) {
			return dataNode;
		}
		
		Node a = head;
		Node b = head.next;
		while (b != null && b.data <= data) {
			a = b;
			b = b.next;
		}
		
		if (b == null) {
			a.next = dataNode;
			dataNode.prev = a;
		}
		else {
			a.next = dataNode;
			dataNode.prev = a;
			dataNode.next = b;
			b.prev = dataNode;
		}
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
