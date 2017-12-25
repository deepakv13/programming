package ds.hackerrank.stack;

import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
	
    static int poisonousPlants(int[] orig) {
    	// 6 5 8 4 7 10 9
    	int numOfDays = 0;
    	while (true) {
    		if (orig.length > 0) {
    			numOfDays++;
        		int[] nextDayPlants = new int[orig.length];
    			nextDayPlants[0] = orig[0];
    			int nextDayPlantsIndex = 1;
        		for (int i = 1; i < orig.length; i++) {
        			if (orig[i] <= orig[i-1]) {
        				nextDayPlants[nextDayPlantsIndex++] = orig[i];
        			}
        		}
        		if (Arrays.equals(orig, nextDayPlants)) {
        			return --numOfDays;
        		}
        		else {
        			orig = nextDayPlants;
        		}
    		}
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}
