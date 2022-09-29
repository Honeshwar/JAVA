package final_abstract_interface_in_inheritance;

public interface Interface {
public static final double PI=3.14;//by default public static final


default int number() {
	return 3;
}
//we can use default in interface,
//if we do default than we cannot do abstract;


//- Illegal combination of modifiers for the interface method num;
//only one of abstract, default, or static permitted.
//static int numb();
//default abstract num();
abstract int num();


int age();
int weight();
String name();


}
