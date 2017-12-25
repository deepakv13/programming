package ds.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
	
    static long largestRectangle(int[] h, int n) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int tp;
    	int i = 0;
    	int maxArea = 0;
    	int areaWithTp = 0;
    	
    	while (i < n) {
    		if (stack.isEmpty() || h[stack.peek()] < h[i]) {
    			stack.push(i++);
    		}
    		else {
    			tp = stack.peek();
    			stack.pop();
    			
    			areaWithTp = h[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
    			
    			if (areaWithTp > maxArea) {
    				maxArea = areaWithTp;
    			}
    		}
    	}
    	
    	while (!stack.isEmpty()) {
			tp = stack.peek();
			stack.pop();
			
			areaWithTp = h[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
			
			if (areaWithTp > maxArea) {
				maxArea = areaWithTp;
			}
    	}
    	
    	return maxArea;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h, n);
        System.out.println(result);
        in.close();
    }

}
