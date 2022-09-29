package exception;

public class ExceptionUse {
	
	
static int divide(int a,int b) throws DivideException {
	  if(b==0) {
		  throw new DivideException();
		//  throw new ArithmeticException();// every arithmetic operator Exception are in it
	  }
	  return a/b;
  }
// handle the exception.
public static void main(String[] args)  {
	//return;
	try {
		int a=5/0;
		System.out.println(divide(1, 0));//(1,0)
		System.out.println(2/0);
	} catch (DivideException e) {
		System.out.println("divide by zero exception"
				+ " by DivideException class ");
		//return;
		//e.printStackTrace();
		
	}
	/* Generic Exception
	 * for every one eXCEPTION only one catch execute.
	 * BELOW CATCH NOT EXECUTE BECAUSE EXCEPTION THROWS IS CATCH ABOVE for(1,0). 
	 * valid for every Exception because it is a super class
	 * */
	catch(Exception divide) {
		System.out.println("divide by zero exception by super class");
		//
		divide.printStackTrace();
	}
//		catch(ArithmeticException divide) {
//		System.out.println("divide by zero exception by super class");
//		//
	/* benefit of this block is that it will always execute like try block.
	 * use to end some process ,etc...
	 * example Scanner , we want to stop scanner before loops/recursion end
	 * we can do in this block  */
	finally {
		System.out.println("hhi i'm in finally block ");
	}
	// benefit it don't stop further execution.
	System.out.println("hhi i'm at last ");



//pass the Exception
//	public static void main(String[] args) throws DivideException {
//		System.out.println(divide(1, 0));
//	}
// it  stop further execution.
//System.out.println("hhi i'm at last ");






try {
	//divide(1,0);
	return;
}finally {
	System.out.println("allgood");
}











}
}
