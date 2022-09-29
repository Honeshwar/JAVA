package dynamic_Programing;

public class Min_Steps_ITERATIVE_DP {
	/*
	2
	    Time Complexity : O(n)
	3
	    Space Complexity : O(n)

	    Where 'n' is the total number of steps
	6
	*/

	 class Solution {

	    public static int countMinStepsToOne(int n) {

	        if (n == 1) {
	 
	            return 0;

	        }

	        int[] minSteps = new int[n + 1];

	        minSteps[1] = 0;

	        for (int currStep = 2; currStep <= n; currStep++) {

	            int subtractOne = Integer.MAX_VALUE;
	  
	            int divideByTwo = Integer.MAX_VALUE;
	             int divideByThree = Integer.MAX_VALUE;

	            subtractOne = minSteps[currStep - 1];

	            if (currStep % 2 == 0) {
	  
	                divideByTwo = minSteps[currStep / 2];
	  
	            }

	            if (currStep % 3 == 0) {
	 
	                divideByThree = minSteps[currStep / 3];
	             }

	            minSteps[currStep] = 1 + Math.min(subtractOne, Math.min(divideByTwo, divideByThree));
	         }

	        return minSteps[n];
	       
	    }

	}

	    
}
