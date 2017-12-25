package ds.hackerrank.linkedlist;

public class ListComparator {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node headA = insert(null, 1, 0);
		headA = insert(headA, 2, 1);
		headA = insert(headA, 5, 2);
		headA = insert(headA, 3, 2);
		headA = insert(headA, 4, 3);
		print(headA);
		System.out.println();
		Node headB = insert(null, 1, 0);
		headB = insert(headB, 2, 1);
		headB = insert(headB, 5, 2);
		headB = insert(headB, 3, 2);
		headB = insert(headB, 4, 3);
		print(headB);
		System.out.println();
		System.out.println(compareLists(headA, headB));
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
	
	private static int compareLists(Node headA, Node headB) {
		int isEqual = 1;
		if (headA == null || headB == null) {
			isEqual = 0;
		}
		else {
			while (headA != null && headB != null) {
				if (headA.data != headB.data) {
					isEqual = 0;
					break;
				} 
				else {
					headA = headA.next;
					headB = headB.next;
				}
			}
			if (headA == null && headB != null) {
				isEqual = 0;
			}
			else if (headA != null && headB == null) {
				isEqual = 0;
			}
		}
		return isEqual;
	}
}
