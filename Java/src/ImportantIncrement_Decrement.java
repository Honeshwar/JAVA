package fundamental;

public class ImportantIncrement_Decrement {

	public static void main(String[] args) {
//		int a=60,b=70;
//		b=~a;
//		if(a!=60&&a/0==0)// no error by a/0 because first condition is false so compile don't execute second condition
//			System.out.println("false");
//		else
//	System.out.println(a+" "+b );

	int a=10;
	//a+=a++;
	//a+=5+(++a+(a++));// ++a-
	//a+=6*a;
		//System.out.println(a);
	//for(int i=386;i>0;i%=3) {
//		System.out.println("*");
	//}
	
	/* ####"break" is used to exit from the current loop.
	####"return" statement is used to exit from the current function.
	####"continue" is used to skip the current iteration of a loop and continue with the next iteration.*/
	
//	int i=0;
//	for(;;) {// no condition , loop i++ hota gayaga infinite time, there is no condition to stop loop
//		if (i==5) {// i=5,this loop get break(broken or stop)
//			
//			break;
//		}
//		System.out.println(i);
//		i++;
//	}
	
	
	
	
	
//	for(int i1=7;i1!=0;i1--) {
//	System.out.println(i1--);// post fix increment,first give i then i--. i=7 print then 7-- then 6-- then i=5
//}
/*7,5.3,1,-1,-3.........
*/
	
//	for(int i=1;;i++) {
//		if(i<5) {
//	
//			break;
//			//System.out.println("breaking loop reached this time");   //this line is never read or execute by compiler
//		}
//	System.out.println(i);}
	
//	
//	
//	for(int i=1;;i++) {
//		if(i<5) {System.out.println(i);
//		}else {
//			break;}
//		
//		}
	
	
	
	
	
//	for(int i=1;;i++) {// large swimming pool(main methods) having multiple bucket in it ,and bucket having different things
//		// that by i is  valid to use two time
//		if (i==5) {
//			
//			break;
//		}
//		System.out.println(i);
//		
//	}
//	    int a=10,b=20;
//	    System.out.println(a+++--b);//line 1
//	    System.out.println(a--+++b);//line 2
//	    System.out.println(a++-++b);//line 3
//	    System.out.println(a+++++b);//line 4
	    /*As + operator and ++ operator have equal precedence.
        Similarly - and -- have equal precedence.
        So in line 2 +++b and in line 4 +++b gives an error.
        To solve this error we can use +(++b).*/
//	}
	
	System.out.println(a++);
	System.out.println(++a);
}}
