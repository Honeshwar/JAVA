package fundamental;

import java.util.Scanner;

public class AssignmentPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte n=s.nextByte();
		
		byte row=1, number ;
		while(row<=n) {
			byte column=1;
//			number=1;   // 890ms
			int sum = 0;
			while(column<=row) {
				
			System.out.print(column);// 905ms
			sum=sum+column;
			
			if(column<row) {
				System.out.print("+");
				//number++;
			}
			
			column++;
			
			
			}System.out.println("="+sum);
			row++;
		}

	}

}
