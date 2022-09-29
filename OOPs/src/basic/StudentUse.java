package basic;

public class StudentUse {
public static void main(String[] args) {
	
	
	
	Student s2;// only initialize object of student class
//	System.out.println(s2);
	s2=new Student();// stored in heap
	
	//s2.password=3;// private modifier 
	//
	
	
	// here i get password
	System.out.println(s2.getPassword());
	s2.setPassword2(321);//here i set pass.
	System.out.println(s2.getPassword());//here i get set pass.
	
	
	
	
	
	//System.out.println(s2.password);
	s2.name="k";// default
	//s2.j1="3"; //public
	
	
	
	Student s1=new Student();// memory ma ek object create kar k use ar sakta hu
	// new ==block of memory create in heap
	// s1 reference of object
	System.out.println(s1);
	// object is a block of memory(storage) in heap memory that contain properties and functionality.
	
	
	
	System.out.println(s1.name);
	System.out.println(s1.name="Honeshwar");
	
	
	
	
	s1.rollNumber=10;
	//s1==go to object in memory  and s1.rollNUmber== than go to roll variable and store 10 in it.
	//yaha ma s1 reference ko memory ma jana ko bol raha hu and rollNumber variable ma store karna ko bol raha hu 10.
	System.out.println(s1.rollNumber);
	// s1 reference ko memory ma jayo and rollNumber variable print karo.
	
	
}
}
