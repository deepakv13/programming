package crack.coding.interview.hackerrank;

public class CheckBST {
	
    static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int value) {
        	this.data= value;
        }
     }
    
    public static void main(String[] args) {
    	
//        3
//      /   \
//     2     6
//    / \   / \
//   1   4  5  7
    	
    	
		
	}
    
    boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean check(Node current, int min, int max) {
        if (current == null) {
            return true;
        }
        return (min < current.data && current.data < max) &&
               check(current.left, min, current.data) &&
               check(current.right, current.data, max);
    }

}
