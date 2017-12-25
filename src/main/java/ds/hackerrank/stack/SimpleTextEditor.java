package ds.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<String> s = new Stack<String>();
        for (int i = 0; i <= n; i++) {
        	String input = in.nextLine();
        	if (input.startsWith("1")) {
        		String[] tokens = input.split(" ");
        		String newValue = "";
        		if (!s.isEmpty()) {
        			newValue = s.peek();
        		}
        		s.push(newValue + tokens[1]);
        	}
        	else if (input.startsWith("2")) {
        		String[] tokens = input.split(" ");
        		int value = Integer.parseInt(tokens[1]);
        		String newValue = s.peek().substring(0, s.peek().length() - value);
        		s.push(newValue);
        	}
        	else if (input.startsWith("3")) {
        		String[] tokens = input.split(" ");
        		int value = Integer.parseInt(tokens[1]);
        		System.out.println(s.peek().toCharArray()[value - 1]);
        	}
        	else if (input.startsWith("4")) {
        		s.pop();
        	}
        }
	}
}
