package recursion_3;

public class Return_Subset_OF_An_Array {
	public static int [][] returnEverySubset(int[]input){
		 return returnEverySubset(input,0);
	}
	public static int [][] returnEverySubset(int[]input,int startIndex){
		if(startIndex==input.length)// i scan all the element of array index+1 we come.
			return new int [1][0];
		
		int smallOutput[][]=returnEverySubset(input, startIndex+1);// i+1(1) to n-1 tak output give us.
			
		int output[][]=new int [2*smallOutput.length][];// i do work on i.
		
		// output 2D array small output enter
		int row=0;
		for(int i=0;i<smallOutput.length;i++) {
			output[i]=new int [smallOutput[i].length];                     // i=0 kitne coulm hona chiya 
		for(int j=0;j<smallOutput[i].length;j++) {
			output[i][j]=smallOutput[i][j];
			
		}
		row++;
		
		}
		
		// now add our part index element in output 2D array  with small output enter ;
		for(int i=0;i<output.length&& row+i<output.length;i++) {
			output[row+i]=new int [output[i].length+1]; 
//			output[row+i][0]=input[startIndex];
		for(int j=1;j<output[i].length+1;j++) {
			//[row+i][]=input[startIndex]; not here.
			output[row+i][j]=output[i][j-1];
			
		}
		//row++;
		
		}
		
		
		return output;
	}

	
	public static void main(String[] args) {
		int []a= {15,20,12};
		int [][]b=returnEverySubset(a);
		
		
		for(int [] v:b) {
			for(int s:v) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
	
	
	
}
