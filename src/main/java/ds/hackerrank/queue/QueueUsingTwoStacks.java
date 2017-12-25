package ds.hackerrank.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TwoStackQueue queue = new TwoStackQueue();
		int q = in.nextInt();
		while (q-- >= 0) {
			String input = in.nextLine();
			if (input.startsWith("1")) {
				String[] tokens = input.split(" ");
				queue.enqueue(Integer.parseInt(tokens[1])); 
			}
			else if (input.startsWith("2")) {
				queue.dequeue();
			}
			else if (input.startsWith("3")) {
				System.out.println(queue.peek());
			}
		}
		
	}
	
	static class TwoStackQueue {
		Stack<Integer> a;
		Stack<Integer> b;
		
		TwoStackQueue() {
			a = new Stack<>();
			b = new Stack<>();
		}
		
		void enqueue(Integer element) {
			a.push(element);
		}
		
		public int dequeue() {
			int item;
			if (!b.isEmpty()) {
				item = b.pop();
			}
			else {
				fill(a, b);
				item = b.pop();
			}
			return item;
		}
		
		public int peek() {
			int item;
			if (!b.isEmpty()) {
				item = b.peek();
			}
			else {
				fill(a, b);
				item = b.peek();
			}
			return item;
		}

		private void fill(Stack<Integer> src, Stack<Integer> target) {
			while (!src.isEmpty()) {
				target.push(src.pop());
			}
		}
	}
}
