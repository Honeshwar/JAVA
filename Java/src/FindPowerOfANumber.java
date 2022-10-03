package fundamental;

import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		byte x=s.nextByte();  //  max. value of x=8 ,n=9 that lies 
		                      //  between -128 to 127--> 1 byte = 8 bits
		byte n=s.nextByte();
		int answer=1,i=1;
		while(i<=n) {
			answer=answer*x; // implicit type casting
			i++;
		}
		System.out.println(answer);

		
		
//		
//	int answer1=(int) Math.pow(x, n);	
//		
//		System.out.println(answer1);
	}

}
