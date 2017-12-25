package ds.hackerrank.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];
        long max = 0;
        long temp = 0;
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            arr[a-1] += k;
            if (b < n) {
            	arr[b] -= k;
            }
        }
        in.close();
        
        for (int i = 0; i < n; i++) {
        	temp += arr[i];
        	if (temp > max) {
        		max = temp;
        	}
        }
        System.out.println(max);
    }
}

