package crack.coding.interview.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
    	this.magazineMap = new HashMap<String, Integer>();
    	this.noteMap = new HashMap<String, Integer>();
    	populateMap(magazine, magazineMap);
    	populateMap(note, noteMap);
    }
    
    private void populateMap(String source, Map<String, Integer> target) {
    	String[] tokens = source.split(" ");
    	for (String token : tokens) {
    		Integer count = new Integer(1);
    		if (target.containsKey(token)) {
    			count = target.get(token) + 1;
    		}
    		target.put(token, count);
    	}
	}

	public boolean solve() {
        boolean answer = true;
		for (Entry<String, Integer> entry : noteMap.entrySet()) {
			String word = entry.getKey();
        	if (magazineMap.get(word) != null && entry.getValue() <= magazineMap.get(word)) {
        		
        	}
        	else {
        		answer = false;
        	}
        }
		return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
