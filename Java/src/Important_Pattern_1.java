package fundamental;

import java.util.Scanner;

public class Important_Pattern_1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		
		byte n=s.nextByte();
//		n=(byte)(2*n+1);
//		byte n1,n2;
//		
//		n1=(byte)((n+1)/2);
//		n2=(byte)(n/2); // n1-1
//		
//		// First half of pattern
//		byte i=1;
//		while(i<=n1) {
//		      if(i==1 ) {
//		    	  System.out.print("*");
//		    	 
//		      }else {
//		    	 if(i<=n1-1) {
//		    		  System.out.print("*");
//		    		  byte a=1;
//		    		  while(a<=2*i-3) {
//		    			  System.out.print(a);
//		    			  a++;
//		    		  }
//		    		  System.out.print("*");
//		    		
//		    	  }
//		   
//		      
//		      }   System.out.println();
//   		               i++;
//		      }
//		      byte i2=n2;
//		    
//		    	  while(i2<=n2) {
//		    		  if  (i2==1) {
//		    			  System.out.print("*");
//		    		  }else {
//		    			  
//		    		  
//		    		  System.out.print("*");
//		    		  byte a=1;
//		    		  while(a<=2*i2-3) {
//		    			  System.out.print(a);
//		    			  a++;
//		    		  }
//		    		  System.out.print("*");}
//		    		   System.out.println();
//		    		   i2--;
//		      }
//		      
		
		System.out.println("*");
		byte i1=1;
		while(i1<=n) {
			System.out.print("*");
			byte j1=1;
			while(j1<=i1) {
				System.out.print(j1);
				j1++;
			}j1=(byte) (j1-2);
//			j1--;
//			j1--;
			while(j1>=1) {
				
				System.out.print(j1);j1--;
			}
			System.out.print("*");
			System.out.println();
			i1++;
		}
		
		
		byte i2=(byte)(n-1);
		while(i2>=1) {
			System.out.print("*");
			byte j2=1;
			while(j2<=i2) {             // increasing ma 2 element
				System.out.print(j2);
				j2++;
			}
			j2--;
			
			while(--j2>=1) {
				System.out.print(j2);
			}
			System.out.print("*");
			System.out.println();
			i2--;
		}
		
		
		
		
	}}


