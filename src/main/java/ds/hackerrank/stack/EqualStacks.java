package ds.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        
        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        Stack<Integer> stackC = new Stack<Integer>();
        
        fillStack(stackA, h1);
        fillStack(stackB, h2);
        fillStack(stackC, h3);
        
        int height = balanceStack(stackA, stackB, stackC);
        System.out.println(height);
    }

	private static int balanceStack(Stack<Integer> stackA, Stack<Integer> stackB, Stack<Integer> stackC) {
		int sumA = stackA.pop();
		int sumB = stackB.pop();
		int sumC = stackC.pop();
		
		int min = Math.min(sumA, Math.min(sumB, sumC));
		
		while(true) {
			while (sumA > min && !stackA.isEmpty()) {
				sumA -= stackA.pop();
			}
			while (sumB > min && !stackB.isEmpty()) {
				sumB -= stackB.pop();
			}
			while (sumC > min && !stackC.isEmpty()) {
				sumC -= stackC.pop();
			}
			if (sumA == sumB && sumB == sumC) {
				return sumA;
			}
			min = Math.min(sumA, Math.min(sumB, sumC));
		}
	}

	private static void fillStack(Stack<Integer> stack, int[] arr) {
		int size = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			size += arr[i];
			stack.push(arr[i]);
		}
		stack.push(size);
	}

}
