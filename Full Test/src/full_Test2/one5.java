package full_Test2;

	 
	import java.util.*;
	
	public class one5{
	public class Solution{ 
		public static void main(String[] args) 
		{ 
		    Scanner s = new Scanner(System.in);
	        int A=s.nextInt();
	        int X=s.nextInt();
	        int n=s.nextInt();
	        
	        
	         series(A, X, n);
		} 
	 




	    // function to print the series
	    static void series(int A, int X, int n)
	    {
	         
	        // Calculating and printing first
	        // term
	        int term = (int)Math.pow(A, n);
	        System.out.print(term + " ");
	 
	     
	        for (int i = 1; i <= n; i++) {
	 
	          
	            term = term * X * (n - i + 1)
	                                / (i * A);
	 
	            System.out.print(term + " ");
	        }
	    }
	 
	  

	}
	 
}