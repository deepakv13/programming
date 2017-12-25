package ds.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaxElement {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Stack<StackNode> s = new Stack<>();
        int max = Integer.MIN_VALUE;
    	for (int i = 0; i < n; i++) {
    		String q = in.nextLine();
    		if (q.startsWith("1")) {
            	String[] tokens = q.split(" ");
            	int j = Integer.parseInt(tokens[0]);
            	int k = Integer.parseInt(tokens[1]);
            	max = Math.max(max, k);
            	s.add(new StackNode(k, max));
        	}
    		else if (q.startsWith("2")) {
    			if (!s.isEmpty()) {
    				s.pop();
    			}
    			if (s.isEmpty()) {
    				max = Integer.MIN_VALUE;
    			}
    			else {
    				max = s.peek().curMax;
    			}
    		}
    		else if (q.startsWith("3")) {
    			if (!s.isEmpty()) {
    				System.out.println(s.peek().curMax);
    			}
    		}
    	} 
	}
	
	static class StackNode {
		int value;
		int curMax;
		
		StackNode (int value, int max) {
			this.value = value;
			this.curMax = max;
		}
	}
	
	/*
	 * 
	//solution 1
	 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Stack s = new Stack(n);
        for (int i = 0; i < n; i++) {
        	String q = in.nextLine();
        	if (q.startsWith("1")) {
            	String[] tokens = q.split(" ");
            	int j = Integer.parseInt(tokens[0]);
            	int k = Integer.parseInt(tokens[1]);   
            	s.push(k);
        	}
        	else if (q.startsWith("2")) {
        		s.pop();
        	}
        	else if (q.startsWith("3")) {
        		System.out.println(s.getMax());
        	}
        }
	}
	
	static class Stack {
		
		private int[] items;
		
		private int top;
		
		private int max;
		
		Stack (int n) {
			items = new int[n];
		}
		
		void push (int i) {
			items[top++] = i;
			if (i > max) {
				max = i;
			}
		}
		
		int pop() {
			int item = 0;
			if (top >= 1) {
				int t = --top;
				item = items[t];
				items[t] = 0;
			}
			if (item == max) {
				max = findMax();
			}
			return item;
		}

		private int findMax() {
			int max = 0;
			for (int i = 0; i < items.length; i++) {
				if (items[i] > max) {
					max = items[i];
				}
			}
			return max;
		}
		
		public int getMax() {
			return this.max;
		}
	}
	*/

}
