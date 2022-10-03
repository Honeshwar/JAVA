package fundamental;
import java.util.Scanner;// Scanner class
public class InputFromUser {

	public static void main(String[] args) {
		int a ,b,c;
		String str,str_1,str_2; char ch;
		Scanner scanner = new Scanner(System.in); // object create scanner in Scanner class
		// woh mera sara input la ga
//		System.out.println("Enter first number");
//		a=scanner.nextInt();
//		
//		System.out.println("Enter second number");
//		b=scanner.nextInt();
//		c=a+b;
//		System.out.println(c +"\n");
//		 System.out.println("Enter text");
//		 
//	    str=scanner.next();//string already in main
	   System.out.println("see difference"); 
	   
	    System.out.println("1 "); 
	    str_1=scanner.next();//it print only word before space, use nextLine(); instead of next(); to avoid next line error
	 // scanner.nextLine();
	   
	    System.out.println("2");
	    str_2=scanner.nextLine(); // use for printing complete line , if empty then print next line
	    //compiler think str_2 is  empty next line
//	    "s.next()" scans and returns the next token as String. A token is part of entered line that 
//	    is separated from other tokens by space, tab or newline. So when input line is - “abc def 10” then s.next()
//	    returns the first token as String i.e. “abc” and s.nextInt() tries to convert the next token i.e. “def” into an int,
//	    which gives InputMismatchException.===
//	    str_1=scanner.next();    a=scanner.nextInt();
	    
	    
	//    		ch=str.charAt(2);
	//    System.out.println( str + "\n"+ch);
	    System.out.print(str_1+"\n"+str_2); 
	
	
	
	}

}
