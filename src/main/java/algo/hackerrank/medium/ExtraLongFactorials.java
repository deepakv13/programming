package algo.hackerrank.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

	private static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		if (n <= 1) {
			return BigInteger.ONE;
		}
		else {
			result = result.multiply(BigInteger.valueOf(n)).multiply(factorial(n-1));
		}
		return result;
	}
}
