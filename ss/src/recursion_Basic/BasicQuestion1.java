package recursion_Basic;

public class BasicQuestion1 {
	public class Solution {

		public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
	    int num = 3;
	    print(num);
	}

	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
