package crack.coding.interview.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TriesContact {
	
    public static void main(String[] args) {
        Map<String, Integer> charsToCountMap = new HashMap<String, Integer>();
    	
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if ("add".equals(op)) {
            	add(contact, charsToCountMap);
            }
            else if ("find".equals(op)) {
            	System.out.println(findCount(contact, charsToCountMap));
            }
        }
    }

	private static void add(String contact, Map<String, Integer> charsToCountMap) {
		int start = 0;
		for (int i = 1; i <= contact.length(); i++) {
			String part = contact.substring(start, i);
			Integer value = 1;
			if (charsToCountMap.containsKey(part)) {
				value = charsToCountMap.get(part) + 1;
			}
			charsToCountMap.put(part, value);
		}
	}

	private static int findCount(String contact, Map<String, Integer> charsToCountMap) {
		Integer count = charsToCountMap.get(contact); 
		return  count == null ? 0 : count;
	}

}
