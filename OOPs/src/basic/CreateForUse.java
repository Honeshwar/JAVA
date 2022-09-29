package basic;

public class CreateForUse {

	public static void main(String[] args) {
		CreatePolynomialClass c1=new CreatePolynomialClass();
		c1.setCoef(3, 2);
		CreatePolynomialClass c2=new CreatePolynomialClass();
		c2.setCoef(8, 5);
//		System.out.println(c1.getCoef(-1));
//		c1.print();
		CreatePolynomialClass c3=c1.plus(c2);
		c3.print();
	 c3=c1.subtract(c2);
		c3.print();
		c3=c1.multiply(c2);
	}

}
