package fundamental;

import java.util.Scanner;

public class HelloWorld {
	  public static void main(String [] args)  {
		   Scanner s=new Scanner(System.in);
			
			byte n=s.nextByte();
	        
	        
	        
	        
	        
	        
	        
//	        System.out.println("*");
//			byte i1=1;
//			while(i1<=n) {
//				System.out.print("*");
//				byte j1=1;
//				while(j1<=i1) {
//					System.out.print(j1);
//					j1++;
//				}
//				j1--;
//				//j1--;
//				while(--j1>=1) {
//					
//					System.out.print(j1);
//	                //j1--;
//				}
//				System.out.print("*");
//				System.out.println();
//				i1++;
//			}
//			
//			
//			byte i2=(byte)(n-1);
//			while(i2>=1) {
//				System.out.print("*");
//				byte j2=1;
//				while(j2<=i2) {             
//					System.out.print(j2);
//					j2++;
//				}
//				j2--;
//				
//				while(--j2>=1) {
//					System.out.print(j2);
//				}
//				System.out.print("*");
//				System.out.println();
//				i2--;
//			}
//			System.out.println("*");
			
//	     
//	        char ch='@';
//	        int i=ch;
//	        System.out.println(i);
			byte i=1;
			while(i<=n) {
				System.out.print("*");
			i++;
			}System.out.println();
	       byte spaces=1;
			while(spaces<=i-1) {
				System.out.print(" ");
			}
			
	    }
}
