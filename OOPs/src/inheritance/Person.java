package inheritance;

public class Person {
 public String name;
/* protected modifier
 * can be use inside same package anywhere 
 * and outside package only in child class class.
 * See package basicforModifierPUblic to see use of this modifier 
 * outside package within inherit(child) class
 */

protected String colour;

int age;
 public Person(){
	System.out.println("person class");
}
public void print()
{
	System.out.println("Person Class"+" "
			+ "name="+name+" age="+age+" colour="+colour);
}
public void print(Person p)
{
	p.print();
}
public Person Set(String string) {
	Person p=new Person();
			p.name=string;
	return p;
}
}
