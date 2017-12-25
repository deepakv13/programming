package ds.hackerrank.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = readInput(scanner);
        int N = Integer.valueOf(input.split(" ")[0]);
        int Q = Integer.valueOf(input.split(" ")[1]);
//        System.out.println("N: " + N + ", Q: " + Q);
        List<Integer>[] seqList = createSeqList(N);
        int lastAnswer = 0;
        for (int i = 0; i < Q; i++) {
        	String query = readInput(scanner);
//        	System.out.println("Query: " + query);
        	int t = Integer.valueOf(query.split(" ")[0]);
        	int x = Integer.valueOf(query.split(" ")[1]);
        	int y = Integer.valueOf(query.split(" ")[2]);
        	if (t == 1) {
        		appendValue(seqList, lastAnswer, x, y);
        	} else if (t == 2) {
        		lastAnswer = appendAndPrintValue(seqList, lastAnswer, x, y);
        	}
        }
    }

	private static int appendAndPrintValue(List<Integer>[] seqList, int lastAnswer, int x, int y) {
		int seqIndex = (x ^ lastAnswer) % seqList.length;
		int elementIndex = y % seqList[seqIndex].size();
		lastAnswer = seqList[seqIndex].get(elementIndex);
		System.out.println(lastAnswer);
		return lastAnswer;
	}

	private static void appendValue(List[] seqList, int lastAnswer, int x, int y) {
		int index = (x ^ lastAnswer) % seqList.length;
		seqList[index].add(y);
	}

	private static String readInput(Scanner scanner) {
		String query = scanner.nextLine();
		return query;
	}

	private static List[] createSeqList(int N) {
		List<Integer>[] seqList = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			seqList[i] = new ArrayList<Integer>();
		}
		return seqList;
	}
}
