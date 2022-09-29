package final_abstract_interface_in_inheritance;

public class Use {
	public static void main(String[] args) {
	//Student s=new Student();//not work because of 
	//abstract incomplete method
	// we cannot instantiate(implementor declare) 
	//Cannot instantiate the type Student

		//		Person a=new NAme();// polymorphism
		
	NAme a=new NAme();

		System.out.println(a.age());
//		a.set("hi there");
		System.out.println(a.get());
	
	

	
	
	
	}
}

