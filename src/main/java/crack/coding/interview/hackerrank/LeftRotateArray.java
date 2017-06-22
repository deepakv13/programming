package crack.coding.interview.hackerrank;

import java.util.Scanner;

public class LeftRotateArray {
	
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	for (int i = 0; i < k; i++) {
    		leftRotate(a);
    	}
    	return a;
    }
	
    private static void leftRotate(int[] a) {
    	int head = a[0];
    	int n = a.length;
    	for (int i = 1; i < n; i++) {
    		a[i-1] = a [i];
    	}
    	a[n-1] = head;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
		
//		int[] a = {1, 2, 3, 4, 5};
//		arrayLeftRotation(a, 5, 3);
      
    }

}
