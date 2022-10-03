package fundamental;

import java.util.Scanner;

public class TrianglePattern1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		byte n=s.nextByte();
		byte i=1;
		while(i<=n) {
			         byte spaces=1;
			         while(spaces<=n-i) {
			        	      System.out.print(" ");     
			        	      spaces++;
			        	    
			         }  
			           byte star=1;
			         while(star<=i) {
			        	 System.out.print(star);
			        	 star++;
			         }System.out.println();
			         i++;
		}
	}

}
