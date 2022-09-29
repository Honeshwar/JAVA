package generices;
class Pairs<I,S>{
	private I first;
	private S Second;
	//private Object name;
	public Pairs() {
		
	}
	public Pairs(I first,S second) {
		this.Second=second;
		this.first=first;
		
	}

void setFirst(I first) {
	 this.first=first;
}
void setSecond(S second) {
	 this.Second=second;
}
I getFirst() {
	int i=0;
	return this.first;
}
S getSecond() {
	return this.Second;
}

void print() {
	 System.out.println("name="+first
			 +" age="+Second);
}
//public Pairs<Pairs<Integer, String>, String> setFirst(String string) {
//	// TODO Auto-generated method stub
//	return null;
//}

}
public class Chain_Generic_Pair {

	public static void main(String[] args) {
	//<MultipleGeneric<Integer,String>,String> pair=new MultipleGeneric<>();
	
		Pairs<Pairs<Integer,String>,String> p=new 
				Pairs<>(new Pairs<>(),"d");
		System.out.println(p.getFirst());
		// null =Pairs<Integer,String>
		
		
		
	Pairs<Integer,String> p1=new Pairs<>(0,"j");
	Pairs<Pairs,String> p2=new Pairs<>();
	p2.setFirst(p1);
	System.out.println( p2.getFirst().getFirst());
		System.out.println(p1.getFirst().MAX_VALUE);
				p.print();
				p.setFirst(p1);// type=class, 
				//class class oblect set kar sakte hai
			System.out.println(p.getFirst());//reference of p1
			System.out.println(p.getSecond());
	
	// how to access first both pair
	System.out.println(p.getFirst().getFirst());//first reference me ja k fit value milagi
	// null call null
		System.out.println(p.getFirst().getSecond());
		//System.out.print(p.setFirst("jhg").setFirst("es"));
	}

}
