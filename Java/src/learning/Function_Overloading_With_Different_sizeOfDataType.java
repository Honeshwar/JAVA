package learning;

public class Function_Overloading_With_Different_sizeOfDataType {
//	public static int sum(int a,int b)
//	{
//	    System.out.print("int sum ");
//	    return a+b;
//	}
		public static short sum(int a,int b)
		// (short a, short b)
		//  explicit type casting not valid in input in  function overloading
	{
			
	    System.out.print("short sum ");
	    return (short) (a+b);	
	    // output in short due to explicit type casting
	}

//	public static long sum(long a,long b)  
		// implicit type casting valid  in input only not in output. So,result in long
//	{                                     
		//As both the datatypes are int (integers)
//		                                 
		//   So first function would be called.
//	    System.out.print("long sum ");
//	    return a+b;
//	}
	public static void main (String[] args) {
	        int a=4;
	        int b=5;
	    System.out.println(sum(a,b));
	    System.out.print(sum(2.0,6.0f));
	}

	public static double sum (double a,double b) {
		
		return a+b;
	}
}
