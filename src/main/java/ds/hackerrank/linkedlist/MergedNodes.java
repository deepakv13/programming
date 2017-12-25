package ds.hackerrank.linkedlist;

public class MergedNodes {
	
	static class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		Node a = new Node();
		a.data = 1;
		
		Node b = new Node();
		b.data = 2;
		
		Node c = new Node();
		c.data = 3;
		
		Node d = new Node();
		d.data = 4;
		
		Node e = new Node();
		e.data = 5;
		
		Node f = new Node();
		f.data = 6;
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = null;
		
		print(a);
		System.out.println();
		
		Node x = new Node();
		x.data = 101;
		
		Node y = new Node();
		y.data = 202;
		
		x.next = y;
		y.next = d;
		
		print(x);
		System.out.println();
		
		System.out.println(findMergeNode(a, x));
	}
	
	static int findMergeNode(Node headA, Node headB) {
		Node a = headA;
		while (headB.next != null) {
			while (headA.next != null) {
				if (headA.next == headB.next) {
					return headA.next.data;
				}
				else {
					headA = headA.next;
				}
			}
			headA = a;
			headB = headB.next;
		}
		return 0;
	}
	
	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		System.out.print("null");
	}

}
