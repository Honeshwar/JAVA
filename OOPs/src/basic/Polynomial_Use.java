package basic;

public class Polynomial_Use {

	public static void main(String[] args) {
//		Polynomial p1=new Polynomial();//constructor by default Dynamic array give
//		Polynomial p2=new Polynomial();
//		p1.setCoefficient(0, 3);
//		p2.setCoefficient(0, 2);
//		p1.print();p2.print();
//		Polynomial p3;
//		//p3=p1.add(p2);
////		p3=p1.subtract(p2);
//		p3=p1.multiply(p2);
//		p3.print();
		/*Polynomial2 */
		Polynomial2 p4=new Polynomial2();//constructor bydefault Dynamic array give
		Polynomial2 p5=new Polynomial2();
		p4.setCoefficient(66, 3);
		p5.setCoefficient(4, 2);
		p4.print();p5.print();
		Polynomial2 p6;
		//p3=p1.add(p2);
//		p3=p1.subtract(p2);
		p6=p4.multiply(p5);
		p6.print();
	}

}
