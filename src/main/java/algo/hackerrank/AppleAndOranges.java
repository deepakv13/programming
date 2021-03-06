package algo.hackerrank;

import java.util.Scanner;

public class AppleAndOranges {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int appleFallenInHouse = doCount(a, apple, s, t);
        System.out.println(appleFallenInHouse);
        int orangeFallenInHouse = doCount(b, orange, s, t);
        System.out.println(orangeFallenInHouse);
    }

	private static int doCount(int treeIndex, int[] fruit, int s, int t) {
		int result = 0;
		for (int i : fruit) {
			int fruitFallIndex = treeIndex + i;
			if (fruitFallIndex >= s && fruitFallIndex <= t) {
				result++;
			}
		}
		return result;
	}
    
    

}
