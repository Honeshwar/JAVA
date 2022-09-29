package basic;

public class Fraction {
private int numerator;
private int denominator;
// private because i don't want to (other)user to change directly.
//for that i create getter and setter method

//constructor cannot be private because every object use it.
 Fraction(int numenator,int denomenator){
	 
	this.numerator=numenator;
	this.denominator=denomenator;
	// constructor call toh that time fraction minimum
	simplify();
}
// this function is private because it cannot be call by any object.
 //this is for internal  calculation (to simplify fraction).


 
 private void simplify() {
	// minimum fraction ma convert numerator or denominator ko 
	int gcd=1;
	int min=Math.min(numerator, denominator);
	for(int i=2;i<=min;i++) {
		if(numerator%i==0&&denominator%i==0) {
		gcd=i;
		}
	}
	this.numerator=numerator/gcd;
	this.denominator=denominator/gcd;
	
	
	
	
	
	
	
	
	
	
	
}

// All the function cannot be private because every object use it.
// use for set ,print,etc.. like objectname.print();
 void print() {
	System.out.println(numerator+"/"+denominator);
}
 int getNumerator() {
	return numerator;
}
 void setNumerator(int numerator) {
	this.numerator=numerator;
}
 int getDenominator() {
	 if(denominator==0) {
		 // error throw;
		 this.denominator=1;
		// return;
	 }
	return denominator;
}
 void setDenominator(int denominator) {
	this.denominator=denominator;
}
 void increment() {
	this.numerator=numerator+denominator;
	
}
// this function add to object and stored value in first object f1,
// like f1.add(f2);
void add(Fraction object) {// argument as class object  is passed.
	//this== first object and f1.add(f2)
	this.numerator=this.numerator*object.denominator
			+this.denominator*object.numerator;
	this.denominator=this.denominator*object.denominator;
	simplify();
}


/*now we create function that stores value in any  new object other
 * 
 *  than current object (like this.nunerator)*/

// if i don't use static ,the every object use memory to store that value
// so lot of memory used
//that by i use static
// static because we have to pass this function value to some
// class object(not current object like this.nunerator).
public static Fraction add (Fraction obj1,Fraction obj2) {
	// return type is class Fraction object
	int num=obj1.numerator*obj2.denominator
			+obj1.denominator*obj2.numerator;
	int deno=obj1.denominator*obj2.denominator;
	
	
	
	Fraction obj3=new Fraction(num,deno);
	// no need to call simplify because constructor call it in it.
	return obj3;
	
	
	
	
	
}














}
