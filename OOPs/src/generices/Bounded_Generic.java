package generices;
class Print{
	public static <T extends InterfaceForPrint>  void arrayPrint(T arr[]) {
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
			arr[i].print();// bound karna se print create hua, all String ,
						  //Integer etc.. not have prinnt method
		}
	}
}
public class Bounded_Generic {

	public static void main(String[] args) {
		Print p2=new Print();
		Person p=new Person("Honewshwar",21);
		System.out.println(p);
		p.print();
		
		Person p1[]=new Person[5];
	
		/*		--> 5 object create hua.
			-->	 this is array not class object,
			-->	p[i] reference and now we create object of Person by initializing 
			    new Person(); to each reference.then object creation happen.
			--> array of object of reference hai.
			--> p1 reference of object of  Person class Create kiya h in array. */
		
		for(int i=0;i<p1.length;i++) {
			//p1[i]=p1[i+1]; reference stored
			p1[i]=new Person("Honewshwar",21);//p[i] is every  reference ,
											//	new create object of person in memory 
		}//p2.arrayPrint(p1);
		Print.arrayPrint(p1);
	}

}
