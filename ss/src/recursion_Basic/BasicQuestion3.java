package recursion_Basic;

public class BasicQuestion3 {
	public class Solution {

		public static int power(int x, int n) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
			 * Taking input and printing output is handled automatically.
			 */
			// int answer= (int) (Math.pow(x,n));
			// return answer;
	        
	        if(n==0){
	            return 1;
	        }
	        int smallOutput=power(x,n-1);
	        int output=x*smallOutput;
	        return output;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
