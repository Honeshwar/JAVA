package fundamental;

import java.util.Scanner;

public class Important_Pattern_DiamondOfStar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		byte n=s.nextByte();
		byte n1,n2;
		n1=(byte)((n+1)/2);
		n2=(byte)(n/2); // n1-1
		
		// First half of pattern
		byte rowOfFirstHalf=1;
		while(rowOfFirstHalf<=n1) {
			byte spaces=1;
			while(spaces<=n1-rowOfFirstHalf) {
				System.out.print(" ");
				spaces++;
			}
			
			byte stars=1;
			while(stars<=rowOfFirstHalf*(rowOfFirstHalf+1)/2) {// i(i+1)/2 , 2*rowOfFirstHalf-1
				System.out.print("*");
			     stars++;
			}System.out.println();
				rowOfFirstHalf++;
				
				
				
			
		}
		// Second half of pattern
		byte rowOfSecondHalf=n2;
		
		while(rowOfSecondHalf<=n2) {
			if(rowOfSecondHalf<1) {
				return;
			}else {
			byte spacesOfSecondHalf=1;
			while(spacesOfSecondHalf<=n2-rowOfSecondHalf+1) {
				System.out.print(" ");
			    spacesOfSecondHalf++;
		}
		   byte starsOfSecondHalf=1;
		   while(starsOfSecondHalf<=2*rowOfSecondHalf-1) {
			   System.out.print("*");
		   starsOfSecondHalf++;
		   }
		 
	}  System.out.println();
	   rowOfSecondHalf--;
			}

}
}