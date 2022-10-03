package fundamental;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			         int spaces=1;
			         while(spaces<=n-i) {
			        	      System.out.print(" ");     
			        	      spaces++;
			        	    
			         }  
			           int star=1;
			         while(star<=i) {
			        	 System.out.print("*");
			        	 star++;
			         }System.out.println();
			         i++;
		}
	}

}
