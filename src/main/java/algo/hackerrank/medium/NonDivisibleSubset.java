package algo.hackerrank.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Given a set S of  distinct integers, print the size of a maximal subset, S', of S 
 * where the sum of any 2 numbers in S' is not evenly divisible by k.
 * @author deepakvijh
 *
 */
public class NonDivisibleSubset {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
        	values[i] = in.nextInt();
        }
        int result = maxSizeOfNonDivisibleSubset(values, k);
        System.out.println(result);
	}

	private static int maxSizeOfNonDivisibleSubset(int[] values, int k) {
		int maxSubsetSize = 0;
		for (int i = 0; i < values.length/2 + 1; i++) {
			int current = values[i];
			List<Integer> valid = new ArrayList<>();
			valid.add(current);
			for (int j = i+1; j < values.length; j++) {
//				if (i == j) {}
//				else 
				if (isValid(valid, values[j], k)) {
					valid.add(values[j]);
				}
			}
			if (valid.size() > maxSubsetSize) {
				maxSubsetSize = valid.size();
			}
		}
		return maxSubsetSize;
	}

	private static boolean isValid(List<Integer> valid, int item, int k) {
		boolean isValid = true;
		for (int i : valid) {
			if ((i + item) % k == 0) {
				isValid = false;
				break;
			}
		}
		return isValid;
	}
	
	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = scan.nextInt();
		}
		int[] cnts = new int[k];
		for (int i = 0; i < k; ++i) {
			cnts[i] = 0;
		}
		for (int i = 0; i < n; ++i) {
			cnts[arr[i] % k] += 1;
		}
		int cnt = cnts[0] < 1 ? cnts[0] : 1;
		for (int i = 1; i < k / 2 + 1; ++i) {
			if (i != k - i) {
				cnt += cnts[i] > cnts[k - i] ? cnts[i] : cnts[k - i];
			}
		}
		if (k % 2 == 0) {
			cnt += 1;
		}
		System.out.println(cnt);
	}*/
	
}
