package algo.hackerrank;

import java.util.Scanner;

public class StudentGrades {

	static int[] solve(int[] grades) {
		// Complete this function
		int[] finalGrades = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38) {
				finalGrades[i] = grades[i];
			}
			else {
				int nextMultipleOf5 = findNextMultipleOf5(grades[i]);
				if (nextMultipleOf5 - grades[i] < 3) {
					finalGrades[i] = nextMultipleOf5;
				}
				else {
					finalGrades[i] = grades[i];
				}	
			}
		}
		return finalGrades;
	}

	private static int findNextMultipleOf5(int n) {
		int o = n/5;
		return ((o+1)*5);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		
//		System.out.println(findNextMultipleOf5(68));
		

	}

}
