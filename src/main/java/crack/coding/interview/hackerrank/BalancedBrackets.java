package crack.coding.interview.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
    private static final List<Character> OPENING_BRACKETS = Arrays.asList('{', '(', '[');
    private static final List<Character> CLOSING_BRACKETS = Arrays.asList('}', ')', ']');
	
	public static boolean isBalanced(String expression) {
		boolean isBalanced = true;
    	Stack<Character> stack = new Stack<Character>();
        for (Character c : expression.toCharArray()) {
        	if (OPENING_BRACKETS.contains(c)) {
        		stack.push(c);
        	}
        	else if (stack.isEmpty() && CLOSING_BRACKETS.contains(c)) {
        		isBalanced = false;
        	} 
        	else {
        		Character t = stack.peek();
        		if (OPENING_BRACKETS.indexOf(t) != CLOSING_BRACKETS.indexOf(c)) {
        			isBalanced = false;
        			break;
        		}
        		else {
        			stack.pop();
        		}
        	}
        }
    	return isBalanced && stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}
