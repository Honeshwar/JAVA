package basic;

public class SaticKeyword1_Use {
	public static void main(String[] args) {
		
	
StaticKeyword var=new StaticKeyword();

/* not happen this */

//var.year=88;
//var.nameOfPlace="jh";
//System.out.println(var.year);

//Here i also have access to non static variable 
//but it is not a good way to access static variable.
// if i make private to static variable than it is not access by anyone.

/*  not happen this */
//StaticKeyword.year=56;
StaticKeyword.nameOfPlace="Nanital";
//System.out.println(StaticKeyword.year);

/*  happen this */
var.getInfo(76760,"nanital");
StaticKeyword.getInfo(676565, "Nanital");
// Only this work because it is a static function
// its(function) variable is not static.

}}




















