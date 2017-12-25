package ds.hackerrank.linkedlist;

import ds.hackerrank.linkedlist.ListComparator.Node;

public class MergeList {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node headA = insert(null, 5, 0);
		headA = insert(headA, 7, 1);
		headA = insert(headA, 10, 2);
//		headA = insert(headA, 15, 2);
//		headA = insert(headA, 20, 3);
		print(headA);
		System.out.println();
		Node headB = insert(null, 6, 0);
		headB = insert(headB, 9, 1);
		headB = insert(headB, 11, 2);
//		headB = insert(headB, 3, 2);
//		headB = insert(headB, 4, 3);
		print(headB);
		System.out.println();
		print(mergeLists(headA, headB));
	}
	
	private static Node mergeLists(Node headA, Node headB) {
		if (headA == null) {
			return headB;
		}
		else if (headB == null) {
			return headA;
		}
		else {
			if (headA.data < headB.data) {
				headA.next = mergeLists(headA.next, headB);
				return headA;
			}
			else {
				headB.next = mergeLists(headA, headB.next);
				return headB;
			}
		}
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
