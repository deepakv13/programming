package ds.hackerrank.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
    
    static int[] leftRotation(int[] a, int d) {
    	for (int i = 0; i < d; i++) {
    		a = leftRotate(a);
    	}
    	return a;
    }

	private static int[] leftRotate(int[] a) {
		int t = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = t;
		return a;
	}

}
