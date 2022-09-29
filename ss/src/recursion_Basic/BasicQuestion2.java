package recursion_Basic;

public class BasicQuestion2 {
	public class Solution {

		public static int count(int n){
	        if(n==0){
	            return 0;
	        }
	        int count=count(n/10);// n/10 toh n%10 bhe use karna pade ga
	        int output=count+1;
			return output;

	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
