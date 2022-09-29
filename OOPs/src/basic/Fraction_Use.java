package basic;

public class Fraction_Use {
public static void main(String[] args) {
	Fraction f1=new Fraction(2,3);
//	f1.getDenominator();
//	f1.print();
//	f1.setDenominator(9);
//	f1.print();
//	f1.increment();
//	f1.print();
	Fraction f2=new Fraction(4,6);
	//f1.add(f2);
	f1.print();
	
	Fraction f3=Fraction.add(f1, f2);
	f3.print();
	
}
}
