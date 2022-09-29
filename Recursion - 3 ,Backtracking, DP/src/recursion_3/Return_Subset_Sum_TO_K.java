package recursion_3;

public class Return_Subset_Sum_TO_K {

	public static int [][] subsetsSumTOK(int[]input,int k){
		return subsetsSumTOK(input, k,0);
	}
	public static int [][] subsetsSumTOK(int[]input,int k,int startIndex){
		//base case= recusion would have to stop
		if(startIndex==input.length)
			if(k==0) {
				int ans[][]=new int[1][0];
				return ans;
			}else {
				int ans[][]=new int[0][0];
				return ans;
			}
		// assumption recusrsion give an array that have subset sum=k element except one./
		int smallOutput1[][]=subsetsSumTOK(input, k-input[startIndex], startIndex+1);// inclusive / taking/ included/.
		int smallOutput2[][]=subsetsSumTOK(input, k, startIndex+1);     // exclusive / not taking / not including the elemeny=t in subset.
		
		int output[][]=new int [smallOutput1.length+smallOutput2.length][];// row fixed
		
		int row=0;
		
		for(int i=0;i<smallOutput2.length;i++) {
			output[i]=new int [smallOutput2[i].length];
			// 2 3 4 col=3
			// 5 4   col=2 , so that [i]
			for(int j=0;j<smallOutput2[i].length;j++) {
				output[i][j]=smallOutput2[i][j];
				row++;
			}
		}
		
		for(int i=0;i<smallOutput1.length;i++) {
			// (i+row) row ko assign an column/.
			// i have to give that particular reference to row because row stored the reference of column.
			output[i+row]=new int [smallOutput1[i].length+1];
			// +1 for line one below (42   ) enter element
			// [2](row) ma colum array created of [4].
			output[i+row][0]=input[startIndex];// due to line 18.
			for(int j=1;j<smallOutput1[i].length+1;j++) {// due to line one above(line 42).
				output[i+row][j]=smallOutput1[i][j-1];
				row++;
			}
		}
		
		// line 42 that put the subset element in  2D array output one by one in each call(recusive).
		
		
		
		
		
		
		
		return output;
	}
}
