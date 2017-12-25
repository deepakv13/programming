package ds.hackerrank.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
    
    static String isBalanced(String input) {
    	char[] openings = new char[]{'{', '(', '['};
    	char[] closings = new char[]{'}', ')', ']'};
    	Stack<Character> s = new Stack<Character>();
    	boolean isBalanced = true;
    	for (char c : input.toCharArray()) {
    		int o = indexAt(openings, c);
    		if (o != -1) {
    			s.push(closings[o]);
    		}
    		else {
    			if (indexAt(closings, c) != -1) {
        			if (!s.isEmpty() && (s.pop() != c)) {
        				isBalanced = false;
        				break;
        			}
    			}
    		}
    	}
    	return s.isEmpty() && isBalanced ? "YES" : "NO";
    	
    	
//    	char[] openings = new char[]{'{', '(', '['};
//    	char[] closings = new char[]{'}', ')', ']'};
//    	String YES = "YES";
//    	String NO = "NO";
//    	Stack<Character> s = new Stack<Character>();
//    	boolean isBalanced = true;
//    	for (char c : input.toCharArray()) {
//    		int o_index = indexAt(openings, c);
//    		if (o_index != -1) {
//    			s.push(c);
//    		}
//    		else {
//    			int c_index = indexAt(closings, c);
//    			if (indexAt(openings, s.pop()) != c_index) {
//    				isBalanced = false;
//    				break;
//    			}
//    		}
//    	}
//    	return isBalanced ? YES : NO;
    }

	private static int indexAt(char[] arr, char c) {
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}

// }}))[)]{][)))][]){([)(([))]})[[({{){]}{]{([]}{]}]()}}()[}[[[(][]{))}{}{[)){})()]})([[[[((])})})}()[(({})))({][[][[)[(()(}]})]{[({)}][]{){]}{{(({(}[}{[)[(][))}()){]}][}(((}(}{)({{(]}]))}}]]][)))}{()()]{[}{({){]}({})[{(][](])(}]){{}(][)[[{]{]{(]}{)){}[{{{)]{[[][][())([[{){][(({){}[])}[{([}}{{}][)]]{})}}[{]{(]()}]{}}{{}({]}(]]()}(}]}]({[()(]]{{){})[{{)}({])]{)({[{](]{}(]])]](]()[{{[[){})(}}{(()()})([)(}{(])[{([]){}{{{]{]{{}[({]{[(()){}[)}(([[([{}}){]](}[{}}(){}[[)[}}{}[]{(){][]](}]})[[))))][}(}()){()}([}([})[[}}({{[)}][[]])[[}])]][](([}()[)}])][}}}(()(())({{[]][))}{[[[]]{{[{]}{}}))(]]){)][((}((){[(((]((})[((}][]{[]}([][]])({][){}}[{{]}])}()(}{)]}]])(}{[][]){([)))[{[[)))(}][]{]}[{([(}]([{{{))}})}[)[](}({((}{)(](}[}[[())()]
