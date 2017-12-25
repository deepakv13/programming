package ds.hackerrank.queue;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DowntoZero {
	
	private static int[] moves = new int[1000001];

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int N = in.nextInt();
            int minMoves = minMoves(N);
            System.out.println(minMoves);
        }
    }

	private static int minMoves(int n) {
		if (n <= 3) { return n;}
		if (moves[n] > 0) {return moves[n];}
		int min = Integer.MAX_VALUE;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int factor = n / i;
				min = Math.min(min, 1 + minMoves(factor));
			}
		}
		min = Math.min(min, 1 + minMoves(n - 1));
		moves[n] = min;
		return min;
	}
}
