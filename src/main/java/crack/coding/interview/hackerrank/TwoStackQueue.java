package crack.coding.interview.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class TwoStackQueue {
	
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
        		stackNewestOnTop.push(value);
        }

        private void copyElements(Stack<T> source, Stack<T> target) {
        	while(!source.empty()) {
        		target.push(source.pop());
        	}
		}

		public T peek() {
        	T element = null;
        	if (stackOldestOnTop.empty()) {
        		copyElements(stackNewestOnTop, stackOldestOnTop);
        		element = stackOldestOnTop.peek();
        	}
        	else {
        		element = stackOldestOnTop.peek();
        	}
			return element;
        }

        public T dequeue() {
        	T element = null;
        	if (stackOldestOnTop.empty()) {
        		copyElements(stackNewestOnTop, stackOldestOnTop);
        		element = stackOldestOnTop.pop();
        	}
        	else {
        		element = stackOldestOnTop.pop();
        	}
			return element;
        }
    }
    
//    public static void main(String[] args) {
//		MyQueue<Integer> q = new MyQueue<Integer>();
//		q.enqueue(1);
//		q.enqueue(2);
//		q.enqueue(3);
//		System.out.println(q.dequeue());
//		q.enqueue(4);
//	}
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
