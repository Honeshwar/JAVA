package fundamental;

import java.util.Scanner;

public class TrianglePattern3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		byte n=s.nextByte();
		byte i=1;
		while(i<=n) {
			        byte j=1;
			        while(j<=n-i+1) {
			        	int answer=n-i+1;
			        	System.out.print(answer);
			        	j++;
			         }System.out.println();
			         i++;
		}
	}

}
