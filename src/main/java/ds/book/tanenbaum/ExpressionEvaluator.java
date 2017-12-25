package ds.book.tanenbaum;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String infixStr = in.nextLine();
		String postfixStr = convertToPostfix(infixStr); 
		System.out.println("Infix: " + infixStr);
		System.out.println("Postfix: " + postfixStr);
		int value = evaluate(postfixStr);
		System.out.println("Value: " + value);
	}

	private static int evaluate(String postfixStr) {
		Stack<Integer> operandStack = new Stack<Integer>();
		for (char c : postfixStr.toCharArray()) {
			if (c == ' ') {}
			else if (isOperand(c)) {
				operandStack.push(new Integer(String.valueOf(c)));
			}
			else if (isOperator(c)) {
				int b = operandStack.pop();
				int a = operandStack.pop();
				int value = eval(a, b, c);
				operandStack.push(value);
			}
		}
		return operandStack.pop();
	}

	private static int eval(int a, int b, char c) {
		int result = 0;
		switch (c) {
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}
		return result;
	}

	private static String convertToPostfix(String infixStr) {
		StringBuilder postfixStr = new StringBuilder();
		Stack<Character> operatorStack = new Stack<Character>();
		for (char c : infixStr.toCharArray()) {
			if (c == ' ') {}
			else if (isOperand(c)) {
				postfixStr.append(" " + c);
			}
			else if (isOperator(c)) {
				while (!operatorStack.isEmpty() && hasPrecedence(operatorStack.peek(), c)) {
					postfixStr.append(" " + operatorStack.pop());
				}
				operatorStack.push(c);
			}
		}
		while (!operatorStack.isEmpty()) {
			postfixStr.append(" " + operatorStack.pop());
		}
		
		return postfixStr.toString();
	}

	private static boolean hasPrecedence(Character top, char c) {
		List<Character> operators = Arrays.asList('-', '+', '*', '/');
		return operators.indexOf(top) > operators.indexOf(c);
	}

	private static boolean isOperator(char c) {
		return Arrays.asList('+', '-', '*', '/').contains(c);
	}

	private static boolean isOperand(int c) {
		return c >= 49 && c <= 57;
	}
}
