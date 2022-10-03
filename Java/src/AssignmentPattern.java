package fundamental;

import java.util.Scanner;

public class AssignmentPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte n=s.nextByte();
		
		byte row=1;
		while(row<=n) {
			
			byte space=1;     // 907ms
			while(space<=row-1) {
				System.out.print(" ");
				space++;
			}
			byte star=1;
			while(star<=n) {
				System.out.print("*");
				star++;
			}System.out.println();
			row++;
		}
//			byte space =2;        // 994ms  i=1; time consume
//			while(space<=row) {
//				System.out.print(" ");
//				space++;
//			}
//			byte star=1;
//			while(star<=n) {
//				System.out.print("*");
//				star++;
//			}System.out.println();
//			row++;
//		}
	}

}
