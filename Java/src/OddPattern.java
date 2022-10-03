package fundamental;

import java.util.Scanner;

public class OddPattern {
	public static void main(String[] args) {
		Scanner s =new Scanner( System.in);
		byte n=s.nextByte();
		
		byte row=1;     // 911ms
		while(row<=n) {byte count=0;
			byte column=(byte) (2*row-1);
			
		    while(column<=2*n-1) {	
			System.out.print(column);
			count=(byte) (count+1);
			column=(byte) (column+2);
			}
		column=(byte) (column-2);

		if (column==2*n-1) {
			byte k =1;
			while(k<=n-count) {
			byte secondHalf=(byte)(2*k-1); 
					System.out.print(secondHalf);
					k++;
			
			}
		}

		System.out.println();
		
		row++;
		}
			
			
	}

}
