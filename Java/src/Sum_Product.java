package fundamental;

import java.util.Scanner;

public class Sum_Product {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		byte n=s.nextByte();
		byte choice=s.nextByte();
		
		if (choice==1) {
			byte sum=0;
			for(int i=1;i<=n;i++) {
				sum=(byte)(sum+i);
			}System.out.println(sum);
			
		}
		else if(choice==2) {
			int product=1;
			for(int i=1;i<=n;i++) {
				product=product*i;
			}System.out.println(product);
		}
		else {
			
			System.out.println(-1);
		}
	}

}
