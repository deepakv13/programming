package ds.hackerrank.linkedlist;

import ds.hackerrank.linkedlist.InsertAtPosition.Node;

public class DeleteAtPosition {
	
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
//		head = delete(head, 2);
//		print(head);
//		head = delete(head, 1);
//		print(head);
		
//		printReverse(head);
		
		Node tail = reverse(head);
		print(tail);
		System.out.println();
		int d = getNodeValue(tail, 4);
		System.out.println(d);
	}
	
	private static int getNodeValue(Node tail, int pos) {
		Node node = tail;
		while (pos-- > 0) {
			node = node.next;
		}
		return node.data;
	}

	private static Node reverse(Node head) {
		Node newHead = null;
		while (head != null) {
			Node newNode = new Node();
			newNode.data = head.data;
			newNode.next = newHead;
			head = head.next;
			newHead = newNode;
		}
		return newHead;
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
		System.out.println();
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	private static void printReverse(Node head) {
		Node newHead = null;
		while (head != null) {
			Node newNode = new Node();
			newNode.data = head.data;
			newNode.next = newHead;
			head = head.next;
			newHead = newNode;
		}
		print(newHead);
		
	}
	
	public static Node delete(Node head, int position) {
		  // Complete this method
		    if (position == 0) {
		        return head.next;
		    }
		    else {
		        Node prevNode = head;
		        Node targetNode = head;
		        for (int i = 0; i < position; i++) {
		            prevNode = targetNode;
		            targetNode = targetNode.next;
		        }
		        prevNode.next = targetNode.next;
		        return head;
		    }
		}

}
