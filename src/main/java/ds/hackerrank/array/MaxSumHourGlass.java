package ds.hackerrank.array;

import java.util.Scanner;

public class MaxSumHourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        System.out.println(findMaxSumHourGlass(arr));
    }

	private static int findMaxSumHourGlass(int[][] arr) {
		int maxSumHourGlass = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 3; i++) {
			for (int j = 0; j <= arr[0].length - 3; j++) {
				int m = i + 2;
				int n = j + 2;
				int sum = findSumHourGlass(arr, i, j, m, n);
				if (sum > maxSumHourGlass) {
					maxSumHourGlass = sum;
				}
			}
		}
		return maxSumHourGlass;
	}

	private static int findSumHourGlass(int[][] arr, int i, int j, int m, int n) {
		int sum = 0;
		for (int x = i; x <= m; x++) {
			for (int y = j; y <= n; y++) {
				if ( (x == i + 1 && y == j) || (x == i + 1 && y == j + 2) ) {
					// do not add in the sum
				}
				else {
					sum += arr[x][y];
				}
			}
		}
		return sum;
	}
	
	
}
