package crack.coding.interview.hackerrank;


public class NodeCycle {
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	public static Node insert(Node head, int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			return newNode;
		}
		else {
			newNode.next = head;
			return newNode;
		}
	}
	
	public static void main(String[] args) {
		Node one = insert(null, 1);
		Node two = insert(one, 2);
		Node three = insert(two, 3);
		Node four = insert(three, 4);
		Node five = insert(four, 5);
		one.next = four;
		System.out.println(hasCycle(five));
	}
	
	static boolean hasCycle(Node head) {
		if (head == null) return false;
		
		Node slow = head;
		Node fast = head.next;
		
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

}
