package generices;

import inheritance.Person;
class Generic<T>{
	private T number;
	private T age;
	public Generic(T number,T age) {
		this.age=age;
		this.number=number;
		
	}

void setNumber(T number) {
	 this.number=number;
}
void setAge(T age) {
	 this.age=age;
}
T getNumber() {
	return this.number;
}
T getAge() {
	return this.age;
}

void print() {
	 System.out.println("Number="+number
			 +" age="+age);
}


}



public class Generic_Use {
 

	public static void main1(String[] args) {
		Generic<Integer> g=new Generic<Integer>(98765,987);
		g.setAge(22);
		g.setNumber(778);
		g.print();
		Generic<Long> g1=new Generic<>((long)227777777,(long) 22);
		g1.print();
		Generic<Person> g2=new Generic<Person>
		(new Person(),new Person());
		g2.print();
		Integer i=new Integer(19);
		Integer i1=8;
		System.out.println(i+" "+i1);
	}
	
	
	public static void main(String[] args) {
		MultipleGeneric<String,Integer> multiple=new 
				MultipleGeneric<>(null, null);
				
			multiple.print();
	
	
	}

	}


