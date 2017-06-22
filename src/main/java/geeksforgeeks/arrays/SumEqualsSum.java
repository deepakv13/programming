package geeksforgeeks.arrays;

import java.util.Arrays;

public class SumEqualsSum {
	
	public static void main(String[] args) {
		int[] input = {3, 4, 7, 1, 9, 2};
//		int[] input = {65, 10, 7, 90, 1, 9, 8};// code needs to be fixed for this scenario
		int result = checkIfEqualSumPairExist(input);
		System.out.println(result);
	}

	private static int checkIfEqualSumPairExist(int[] input) {
		Arrays.sort(input);
		for (int i = 0, j = input.length -1; i != j; i++, j--) {
			if (input[i] + input[j] == input[i+1] + input[j-1]) {
				return 1;
			}
		}
		return 0;
	}

}
