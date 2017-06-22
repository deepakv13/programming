package crack.coding.interview.hackerrank;

import java.util.Scanner;

public class MakeAnagrams {
	
    public static int numberNeeded(String first, String second) {
    	int n = 0;
    	int[] all = new int[26];
    	for (char c : first.toCharArray()) {
    		++all[c - 'a'];
    	}
    	for (char c : second.toCharArray()) {
    		--all[c - 'a'];
    	}
    	for (int i = 0; i < all.length; i++) {
    		n += Math.abs(all[i]);
    	}
    	return n;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
