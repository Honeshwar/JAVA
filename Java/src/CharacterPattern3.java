package fundamental;

import java.util.Scanner;

public class CharacterPattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte n=s.nextByte();
		byte i=1;
		while (i<=n) {
		byte j=1;
		char p=(char) ('A'+i-1);
		while(j<=i) {
				
			System.out.print(p);
			p =(char)(p+1);
			j++;
		}
		System.out.println();
		i++;
		
		}
		}

}
