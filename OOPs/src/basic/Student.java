 package basic;

public class Student {
	// properties;
		public String name,gender;
	   int rollNumber,age;
	  long phoneNumber;
		private int password;
		
							/* final keyword */
		
		final int a,b;{
			this.a=0;// a=0; work also
			this.b=9;
		}
		final  int aadharNumber;// value=0;
		//this.aadharNumber=0987;// not working
//Student(int aadharNumber ){
//	this.aadharNumber=aadharNumber;
//	
//}
		
		
	               			/*constructor use*/
	// it is a special method that used to initialize object ,for
		//default,
		//parameter,etc
		
	/*default constructor or java (create its on) give us by default when we create object */
//	Student(){
//		
//	}
	// set  default value other than by default of constructor 
 	Student()
	{
			  this.aadharNumber = 0;
			name="Honeshwar";
			  gender="male";
		   rollNumber=10;
		   phoneNumber=858054535;
		   age=10;
			password=392876;


		
	}
	
/*constructor with parameter*/
	//method overload
Student(String name,int age)
{
	this.name=name;
	this.age=age;
	this.aadharNumber = 0;
}
Student(String name)
{
	this.name=name;
	this.age=21;//age;// default value of constructor
	this.aadharNumber = 0;
}

						/*this keyword and getter setter method*/
	//this.name refer to properties (not function variable,
	//function variable is not used outside function)
	//to use password (value) outside 
	public int getPassword() {
		return password;
		//return this.password;//this  stored reference of current object
		//this.password  first compiler goes to reference and find password and return password value.
	}
	
	public void  setPassword2(int password) {// assume pass
		System.out.println("this keyword"+this);
		//password=password;
		  //here local variable=local variable(of function);
		this.password=password;
		//here main  variable inside object = local variable
		// local variable inside function is not directly accessible to user like object.pass 
		// because pass is not global (main) variable like password in line 8.
		// func. variable is not accessible outside func.
	}
	
	//to set good password
	public void  setPassword(int n) {
		password=n;
	}
}
