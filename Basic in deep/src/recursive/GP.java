package recursive;

public class GP {
public static double findgp(int n) {
	if(n==0) {
		return 1;
	}
	
	double result=findgp(n-1)+//1/2^n-1 done by recursive ;
			1/Math.pow(2,n);//1/2^n i do only this;
	
	return result;
}
	public static void main(String[] args) {
		System.out.println(findgp(0));
		System.out.println(findgp(1));
		System.out.println(findgp(2));
		System.out.println(findgp(3));
	}

}
