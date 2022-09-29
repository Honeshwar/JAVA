package algoAnalysisQuestion;

import java.util.Scanner;

public class Pattern {

	public static void print(int n) {
		 int size = 2 * n - 1; 
		        int start = 0;
		        int end = size - 1;
		        int a[][] = new int[size][size];
		        while (n != 0) {
		            for (int i = start; i <= end; i++) {
		                for (int j = start; j <= end;j++) {
		                    if (i == start || i == end || j == start || j == end)
		                        a[i][j] = n;
		                }
		            }
		            ++start;
		            --end;
		            --n;// pre increment for iterating main loop
		        }
		        // printing above filled value
		       for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                System.out.print(a[i][j]);
		            }
		            System.out.println();
		        }
		    }
		  
		public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int n= s.nextInt();
				print(n);
		        s.close();
			}
}
