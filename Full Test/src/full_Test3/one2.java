package full_Test3;

import java.util.Scanner;

public class one2{
	public class Solution {
		public static void main (String[] args) {
		  Scanner s = new Scanner(System.in);
	        int X=s.nextInt();
	        int Y=s.nextInt();
	        
	       int output = minStepToConverXtoY(X,Y);
	        System.out.println(output);

		}
	    
	    
	    
//	     static int minStepToConverXtoY(int x,int y,int X,int Y){
	        
//	              if(X<Y && x<X)// x have to inc
//	                  return 0;
//	             if(X>Y && x>X)// x have to dec
//	                  return 0;
//	         if(x==y )
//	           return 0;
//	          int left=0,right=0;
//	         // if(y>x)
//	           left = minStepToConverXtoY(2*x,y,X,Y);
	        
//	         // if(x>y)
//	           right =minStepToConverXtoY(x-1,y,X,Y);
	        
//	         return Math.min(left,right)+1; // our step +1 for two operation.
//	     }

	static int minStepToConverXtoY(int x,int y){
	 if (x == y)
	            return 0;
	 
	        // Check if conversion is possible or not
	        if (x <= 0 && y > 0)
	            return -1;
	 
	        // If x > y then we can just increase y by 1
	        // Therefore return the number of increments
	        // required
	        if (x > y)
	            return x - y;
	 
	        // If last bit is odd
	        // then increment y so that we can make it even
	        if (y % 2 != 0)
	            return 1 + minStepToConverXtoY(x, y + 1);
	 
	        // If y is even then divide it by 2 to make it
	        // closer to x
	        else
	            return 1 + minStepToConverXtoY(x, y / 2);
	    }




	}
}