package ds.hackerrank.array;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] inputArray = readInputArray();
        int size = inputArray.length;
        for (int i = size - 1; i >= 0; i--) {
        	System.out.print(inputArray[i] + " ");
        }
    }
    
    private static int[] readInputArray()  {       
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());
        int[] inputArray = new int[count];
        String arrayString = scanner.nextLine();
        String[] tokens = arrayString.split(" ");
        int i = 0;
        for (String token : tokens) {
        	inputArray[i++] = Integer.valueOf(token);
        }
        return inputArray;
    }

}
