package inheritance;

public class Use {
	public static void main(String[] args) {
		
	
//	Person h=new Person();
//	h.name="he";
			Teacher she=new Teacher();
			
				she.name="She";
				she.age=9;
				she.staff=2;
				she.colour="white";
				she.print();
			Student h1=new Student();
				h1.name="joke";
				h1.age=9;
				h1.rollNUmber=20;
				h1.colour="brown";
				h1.print();
//			Employee h2=new Employee();
			Employee h2=new Employee(0);
				h2.name="mon";
				h2.age=90;
				h2.id=7382;
				h2.colour="black";
				h2.print();

}
}
