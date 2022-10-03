package basic;

public class FunctionOverloading {
	public static int sum (int a,int b) {
	
	return a+b;
}public static long sum (int b) {
	
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long a=sum(2,9);//implicit type casting
System.out.println(a);
	}

}
