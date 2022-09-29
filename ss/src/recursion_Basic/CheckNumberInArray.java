package recursion_Basic;

public class CheckNumberInArray {
	//public class Solution {
		
		public static boolean checkNumber(int input[], int x) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
			int n=input.length;boolean isNumber=true;
	        if(n==1){
	            if(input[0]==x)
	                return true;// when last element in array is equal to x.
	            else
	                return false;// when last element in array is not equal to x.
	        }
	         
	       else if(input[0]==x){
				return true;// when first element in array is equal to x.
	        }else {
	        // when first element in array is not equal to x.
	            int a[]=new int[n-1];
	            for(int i=1;i<n;i++){
	                a[i-1]=input[i];
	            }
	           
	             isNumber=checkNumber(a,x);// last calle return true all call return true, vice-versa.
	       
	       }
	        return isNumber;// isNUmber return true; all call return true.
	        				// isNUmber return false; all call return false.
	    }
	//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
