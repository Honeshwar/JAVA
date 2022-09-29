package generices;

public class Person implements InterfaceForPrint {
String name;
int age;
public Person() {
	
}
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
 public void print() {
	 System.out.println(name+" "+age);
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
