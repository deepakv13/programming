package ds.hackerrank.linkedlist;

import ds.hackerrank.linkedlist.DeleteAtPosition.Node;

public class ReverseList {
	
	static class Node {
		int data;
		Node prev;
		Node next;
	}
	
	public static void main(String[] args) {
		Node node = sortedInsert(null, 2);
		node = sortedInsert(node, 7);
		node = sortedInsert(node, 3);
		node = sortedInsert(node, 8);
		node = sortedInsert(node, 4);
		print(node);
		node = reverse(node);
		System.out.println();
		print(node);
		
	}
	
	private static Node reverse(Node head) {
		if (head == null) {
			return null;
		}
	    Node temp = head;
	    Node newHead = head;
	    while (temp != null) {
	        Node prev = temp.prev;
	        temp.prev = temp.next;
	        temp.next = prev;
	        newHead = temp;
	        temp = temp.prev;
	    }
	    return newHead;
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
			System.out.print(head.data + " <--> ");
			head = head.next;
		}
		System.out.print("null");
	}

}
