package dynamic_Programing2;

public class Maximum_Square_Matrix_With_All_Zeros {
	
	//recusively
	public static int findMaxSquareWithAllZerosHelper(int[][] input,int i,int j){// i,j  traverse{not  say iterate)
        if(i>=input.length || j>=input[0].length)
        	return 0;
        
        int ans=0;
        if(i+1!=input.length || j+1!=input[0].length) {
        	if(input[i][j+1]==0 && input[i+1][j+1]==0 &&input[i+1][j]==0 ) 
			     ans=1;
		}
        	else {
        		int ans1=findMaxSquareWithAllZerosHelper(input,i,j+1);//right matrix size for all zeros contain
        		int ans2=findMaxSquareWithAllZerosHelper(input,i+1,j+1);//diagonal matrix size for all zeros contain
        		int ans3=findMaxSquareWithAllZerosHelper(input,i+1,j);//down matrix size for all zeros contain
        		
        		ans=ans1+ans2+ans3;
        		
        	}
	
		// matrix contains only 0 and 1.
		if(input[i][j]==0)
			return 1+ans;
		else// 1
			return ans;
	
			
		
	}

	
	//iterative
	//T(N)=O( ^2)
	public static int findMaxSquareWithAllZerosHelper(int[][] input) {
		/* 
		 *
		 * first check row present hai thatn check for col present  hai. 
		 * Order must first row than column,		
		 * because in 2D array row array store array ass value that is column array.
		 * 
		 * 
		 * 
		 * */
		
		
		 
		if(input.length==0 || input[0].length==0)
              return 0;
		  
        int m=input.length;
		int n=input[0].length;
		
		
		int dp[][]=new int [m+1][n+1];
		  //base case (m+1) +1 row  and col enter each cell zero, by default all are zero.
		
		//bottom up apporach user kar raha hu
		int output=0;
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				int sizeOfMatrixSoFar=0; // good to understand by create variable to store calculated value than assign to dp.
				
				if(input[i][j]==0) {
					int right=dp[i][j+1];
					int diag=dp[i+1][j+1];
					int down=dp[i+1][j];
					sizeOfMatrixSoFar=1+Math.min(right, Math.min(diag, down)); // +1 for input[i][j]==0,single matrix conyain only one element ==size=1
					output=Math.max(output, sizeOfMatrixSoFar);
				}else {
					sizeOfMatrixSoFar=0;
				}
				
				dp[i][j]=sizeOfMatrixSoFar;
				
			}
		}
		
		return output;
//		int ans=0;
//		for(int i=m-1;i>=0;i--) {
//			for(int j=n-1;j>=0;j--) {
//				ans=Math.max(ans, dp[i][j]);
//			}
//			}
//		return ans;
	}
	
	
	public static void main(String[] args) {
		int a[][]= {{1,0,0},{1,0,0},{1,1,1}};
		System.out.println(findMaxSquareWithAllZerosHelper(a, 0, 0));
		System.out.println(findMaxSquareWithAllZerosHelper(a));
	}
}
