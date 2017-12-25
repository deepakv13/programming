package ds.hackerrank.linkedlist;

import ds.hackerrank.linkedlist.RemoveDuplicates.Node;

public class CycleDetection {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node one = new Node();
		one.data = 1;
		
		Node two = new Node();
		two.data = 2;
		
		Node three = new Node();
		three.data = 3;
		
		one.next = two;
		two.next = three;
		three.next = two;
		
//		print(one);
		System.out.println();
		boolean hasCycle = hasCycle(one);
		System.out.println(hasCycle);
	}
	
	private static boolean hasCycle(Node head) {
		if (head == null) {
			return false;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}
}
