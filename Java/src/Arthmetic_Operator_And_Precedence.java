package fundamental;

public class Arthmetic_Operator_And_Precedence {

	public static void main(String[] args) {
		//Arthmetic_Operator like 
//	1	+
//	2	-
//	3	*
//	4	%
//	5	/
		
	int a=10;
	int b=3;
	int c =a+b ;
	System.out.println("+-->"+c);
	int c1 =a-b ;
	System.out.println("-_-->"+c1);	
	
	
//	double d = 2/6;//int d = 2/6; answer is 0.0 because our value in integers
//	System.out.println("/-->"+d);
//	int a1=6%2;
//	System.out.println("%-->"+a1);
      int a2=a*b;
	System.out.println("*-->"+a2);
	
//Precedence ( take priority over or come before) --> bodmas with different Precedence
	
//order of precedence | symbols
//	1                 |   ()
//	2                 |   %,*,/    a*b/c--> then first a*b then ab/c
//	3                 |   +,-        3-2+1 = 2then first   3-2     then 1+1=2
	
	int a3=2+3/6;
	System.out.println("precedence");
	System.out.println(+a3);
	int a4= 9%2/1;
	System.out.println(a4);
	int a5 = 3+2-1;
	int a6 = 3-2+1;
	System.out.println(a5 +"\n" + a6);
	  // a+b/c i need in form ab/c
	//then we use bracket ()
	int a7= (3+7)/10;
	System.out.println(a7);
	System.out.println(a+b);
	

	
	
	}

}
