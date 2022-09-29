package recursion_Basic;

public class SumArray {

	//public class Solution {

		public static int sum(int input[]) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
			
	        if(input.length==1){
	            return input[0];
	            
	        }
	        int a[]=new int [input.length-1];
	        for(int i=1;i<input.length;i++){
	            a[i-1]=input[i];
	        }
	        int length_Minus_One_Output=sum(a);
	        return input[0]+length_Minus_One_Output;
		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
