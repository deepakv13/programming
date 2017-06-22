package algo.hackerrank;

import java.util.Scanner;

public class IntegerTripletCompare {


    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] ab = new int[2];
        compare(ab, a0, b0);
        compare(ab, a1, b1);
        compare(ab, a2, b2);
        return ab;
    }

    private static void compare(int[] ab, int a, int b) {
    	if (a > b) {
    		ab[0]++;
    	}
    	else if (b > a) {
    		ab[1]++;
    	}
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}
