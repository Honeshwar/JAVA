package final_abstract_interface_in_inheritance;

public abstract class Person{// implements Interface {
	// final or abstract not happen both at same time.
	// if we do final our class than access  to extends breaks.
	// to inherit in child class breaks,
	//can't inherit final class due to final keyword
 private String name;
private int age;

void set(String name,int age) {
	this.age=age;
	this.name=name;
}
String get() {
	return name+age;
}

//abstract  int age();


}
