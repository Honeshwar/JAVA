package fundamental;

public class Character_Stored_And_Typecasting {

	public static void main(String[] args) {
		//  Character Stored
		char c = 'a'; 
		// character also stored in binary (2 byte storage)
	   //  but before it associated with ASCII values ( 'a'=97 , b=9, A = 65 , '0' = 48)
	   //  so than after it(ASCII values) compile into binary
		// character do not convert into binary
		//because machine understand only binary i.e. 0,1
		
//-------------- type casting only happen when data type our compatible (same type )
		int i = c;  // implicit type casting
		              // automatically done by compiler on the basis of storage 
		// it work when our destination (int i) is greater in storage
		// here 4 bytes(int ) and 2 bytes (char)
		
		char a = (char)i; //explicit type casting 
		                  // any data type ko forcely change another data type 
		//it work when our destination (int i) is less in storage
		// that why our data lost take place-----------------
		// like 4 byte data type try to stored in 2 byte data type
		
		System.out.println(i+"\n"+a);
		short a1 = 7;
		int i1=a1;                        // implicit type casting
		//short a2 = i1;
		short a2 = (short)i1;            //explicit type casting 
		System.out.println(a2+ ""+ i1);
		
		
		double d = 100.04;
		long l2 = (long)d; //explicit type casting
		System.out.println(l2);
		
		
		System.out.println(4+4.5);
		System.out.println(4/5);
		System.out.println((double) 4/5);
		System.out.println((int)5.6+1);
		
		byte b = 50;
		b =  (byte) (b * 50);// data loss
		
//		byte b = 50;
//		b = b * 50;
		
	//	####In 2nd statement, b is multiplied with 50 where b is byte variable and 50 is 
//		an integer. So after the multiplication, result comes as an integer value which 
//		is 2500. Now we are trying to assign this integer to a byte variable, which will 
//		cause the error.
		System.out.println(b);
		
// imp		
		   double a3 = 6 / 4;
	        int b2  = 6 / 4;
	        double c1 = a3 + b2;
	        System.out.println(c1);
	        
	        double a4 = 55.5;
	        int b3 = 55;
	        a4 = a4 % 10;
	        b3 = b3 % 10;
	        System.out.println(a4 + " "  + b3);
		System.out.println();
		
	}

}
