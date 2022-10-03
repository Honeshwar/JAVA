package fundamental;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte n=s.nextByte();
		byte i=1;
		while (i<=n) {
		byte j=1;
		while(j<=i) {
			char answer =(char) ('A'+i-1);//ASCII value of 'A'=65 , char (2 byte)
		//	or i ,1 integer(4 byte) hai toh explicit type casting kari hai
			System.out.print(answer);
			j++;
		}
		System.out.println();
		i++;
		
		}
		}

}
