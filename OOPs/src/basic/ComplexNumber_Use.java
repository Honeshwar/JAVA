package basic;

public class ComplexNumber_Use {
	class Test2 
	{
	    static int a = 10; 
	    int b = 20; 
	    static void fun1() 
	    { 
	    	//static variable is used in static block of function
//	        a = 20;                             //Line 1
//	        b = 10;                             //Line 2
//	        fun2();                             //Line 3
//	        System.out.print(this.b);           //Line 4
	    } 
	    void fun2() 
	    {     
	        System.out.println("from m2"); 
	    }
	}
	class MCQ{    
	    public static void main(String[] args) 
	    { 
	  //      Test.fun1(); 
	    } 
	} 
	
	class Test 
	{ 
	    int a; 
	    int b; 
	    /*
	     * When the object of Test class is created,
	     * the constructor with no arguments is called.
		   When  this(10,20) is encountered , 
		   the constructor with two arguments int and int is called because
		   this is the reference of the object. So using this way we can call more than
		   one constructor.

	     */
	    Test() 
	    {   
	        this(10, 20);   
	        System.out.print("constructor one "); 
	    } 
	    Test(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.print("constructor two "); 
	    } 
	}
	
	    public static void main1(String[] args) 
	    { 
	      //  Test object = new Test(); 
	    } 
	
public static void main(String[] args) {

	ComplexNumber c1=new ComplexNumber(2,3);
	ComplexNumber c2=new ComplexNumber(2,4);
	c1.print();
    System.out.println(c1.getmaginary());
    c1.setImaginary(5);
    System.out.println(c1.getmaginary());
    c1.add(c2);
    c1.print();
    c1.multiply(c2);
    c1.print();
}
}
