package basic;

public class ComplexNumber {
private int real;
private int imaginary;
public ComplexNumber(int number1,int number2) {
	this.real=number1;
	this.imaginary=number2;
	//createComplexNumber();
}
 void multiply(ComplexNumber anotherObject) {
	//current object call to multiply it with another object
	int real=this.real*anotherObject.real-this.imaginary*anotherObject.imaginary;
	int imaginary=this.imaginary*anotherObject.real+this.real*anotherObject.imaginary;
	this.real=real;
	this.imaginary=imaginary;

}
void print() {
	System.out.println(real+"+"+imaginary+"i");
}
void add(ComplexNumber object) {
	int num1=this.real+object.real;//real
	int num2=this.imaginary+object.imaginary;
	this.real=num1;
	this.imaginary=num2;
}
static ComplexNumber add(ComplexNumber object1,ComplexNumber object2) {
	int num1=object1.real+object2.real;
	int num2=object1.imaginary+object2.imaginary;
	ComplexNumber object=new ComplexNumber(num1,num2);
	
	return object;
}
//getter and setter
  int getReal() {
  return real;
}

  void setReal(int number1) {
	  this.real=number1;
  }
 
  String getmaginary() {
  return imaginary+"i";
}

  void setImaginary(int number2) {
	  this.imaginary=number2;
  }


}
