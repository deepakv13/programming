package ds.hackerrank.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
        	String s = in.nextLine();
        	int count = 0;
        	if (map.containsKey(s)) {
        		count = map.get(s);
        	}
        	map.put(s, ++count);
        }
        int Q = Integer.parseInt(in.nextLine());
        for (int i = 0; i < Q; i++) {
        	String q = in.nextLine();
        	int value = 0;
        	if (map.containsKey(q)) {
        		value = map.get(q);
        	}
        	System.out.println(value);
        }
    }

}
