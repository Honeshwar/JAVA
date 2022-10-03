package fundamental;

import java.util.Scanner;

public class Conditionals{
	public static void main(String[] args) {
//	int a =8;	if(a<9)
//			System.out.println(a);;
		
		// by ASCII values through 
		
		Scanner s= new Scanner(System.in);
		
		char ch = s.next().charAt(0);
		boolean a = Character.isUpperCase(ch);
		boolean b = Character.isLowerCase(ch);
		if (a==true) {
			System.out.println("1");
		}else if (a==false) {
			System.out.println("0");
			
		}else System.out.println("-1");
		
			
		System.out.println(ch);	
		
		
		
		
		
		
		
		

//	Scanner s= new Scanner(System.in);
//	
//	char ch = s.next().charAt(0);
//	boolean a = Character.isUpperCase(ch);
//	boolean b = Character.isLowerCase(ch);
//	if (a==true) {
//		System.out.println("1");
//	}else if (b==true) {
//		System.out.println("0");
//		
//	}else System.out.println("-1");
//	
//		
//	System.out.println(ch);	
//		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		String input = s.next();
//		char n =input.charAt(0);
//		
//		
//	     
//        if(n >= 'a' && n <= 'z')
//           {
//               System.out.print("0");
//           }
//        else if(n >= 'A' && n <= 'Z')
//        {
//            System.out.print("1");
//        }
//        else
//        {
//            System.out.print("-1");
//        }
//			
			
			
			
			
			
			
			
			
			
			
			
			
//			
//			
//			
//			Scanner s = new Scanner(System.in);
//			String input = s.next(); char n= s.next().charAt(0);
//			char n =input.charAt(0);
//			boolean b1;
//			 b1=Character.isUpperCase(n);
//		        
//		        if(b1==true)
//		        {
//		            System.out.print("1");
//		            
//		        }
//		        else if(b1==false)
//		        {
//		            System.out.print("0");
//		        }
//		        else
//		        {
//		            System.out.print("-1");
//		        }
////			char a1= Character.toLowerCase(ch);
////			System.out.println(a1);
	}
}