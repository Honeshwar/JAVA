package dynamic_Programing;

public class Iterative_Dynamic_Programing {

	// recusive DP conver int  Iterative_Dynamic_Programing
	
	public static int fib(int n) {

		/* 
		 * 
	 *  without assuming two we cannot create fibonnacci series 
	 *   that number is 0 and 1,(default series value denote 0th,1th terms).
	 *   
		*/
		//edge case
		if(n==0||n==1)
			return n;
		
		int dp[]=new int [n+1];//start 0th term, size array 0to n-1 for n term we need n+1 array size.
		dp[0]=0;
		dp[1]=1;
		
		for(int term=2;term<n+1;term++)
			dp[term]=dp[term-1]+dp[term-2];
		
		
		
		return dp[n];
		
	}
public static void main(String[] args) {
	System.out.println(fib(0));
}
}
