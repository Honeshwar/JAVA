package basic;

public class StaticKeyword {
	//access only by class(somewhat object)
 private static int year;
 static String nameOfPlace;

static {
//	this.year=0;// this stored reference of current object
	StaticKeyword.year=2022;// classname.variable
	year=0;// static belong class
	nameOfPlace="Nanital";
}
// if static function, it call by  classname.functionname (objectname.functionname)
// but it(static) is generally create for memory optimization 
// so  classname.functionname is good.
static void getInfo(int year,String nameOfPlace) {
	System.out.println(StaticKeyword.year=year);
	System.out.println(StaticKeyword.nameOfPlace=nameOfPlace);
}

}
