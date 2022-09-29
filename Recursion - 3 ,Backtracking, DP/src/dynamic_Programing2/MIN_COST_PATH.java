package dynamic_Programing2;

public class MIN_COST_PATH {
// recusive

	/*
	2
	    Time Complexity : O(3 ^ P) where P = (M*N)
	3
	    Space Complexity : O(max(M, N))
	4
	​
	5
	    Where M and N are the rows rows and columns of the matrix.
	6
	*/
	
	public static int minCost(int input[][],int row_Index,int col_Index) {
		// because due to line 11; may possible array may be empty;
		if(input.length==0)
			return Integer.MAX_VALUE;
		// because mater is not always square matrix.
			int row=input.length;
			int col=input[0].length;
			//base case
		if(row_Index>=row || col_Index>=col)
			return Integer.MAX_VALUE;
		//special case
		if(row_Index==row -1 && col_Index==col -1)// destination cell or last ho ga toh
			return input[row_Index][col_Index];
		
		
		int ans1=minCost(input, row_Index, col_Index+1);//right , first cell k right  cell  minCost path return karaga
		int ans2=minCost(input, row_Index+1, col_Index); // down , first cell k down  cell  minCost path return karaga
		int ans3=minCost(input, row_Index+1, col_Index+1); // diagonal , first cell k diagonal  cell  minCost path return karaga
		int myAns=Math.min(ans1, Math.min(ans2, ans3));
//		if(myAns==Integer.MAX_VALUE)
//			myAns=0;
		return myAns+input[row_Index][col_Index];//  i do part work  cost also included
		
		
	}

	
	// memoization or R.D.P
	// T(N)=O(M*N) = NO. OF ELEMENT IN MATRIX MxN
	public static int minCost(int input[][],int row_Index,int col_Index,int dp[][]) {
		if(input.length==0)
			return Integer.MAX_VALUE;
		
		int m=input.length;
		int n=input[0].length;
		if(row_Index==m-1 && col_Index==n-1) {
			dp[row_Index][col_Index]=input[row_Index][col_Index];
			return input[row_Index][col_Index];
		}
		if(row_Index>=m || col_Index>=n)
			return Integer.MAX_VALUE;// min koie effect n pade
		
		
		
		
		
		int down=Integer.MAX_VALUE;
		int diag=Integer.MAX_VALUE;
		int right=Integer.MAX_VALUE;
		
		// recursion give me first output than i do my part
		
		if(dp[row_Index+1][col_Index]==Integer.MAX_VALUE) {
			down=minCost(input, row_Index+1, col_Index, dp);
			dp[row_Index+1][col_Index]=down;///tajki use ho sake next time
		}else {
			down =dp[row_Index+1][col_Index];
		}
		
		if(dp[row_Index+1][col_Index+1]==Integer.MAX_VALUE) {
			diag=minCost(input, row_Index+1, col_Index+1, dp);
			dp[row_Index+1][col_Index+1]=diag;
		}else {
			diag =dp[row_Index+1][col_Index+1];
		}
		
		if(dp[row_Index][col_Index+1]==Integer.MAX_VALUE) {
			right=minCost(input, row_Index, col_Index+1, dp);
			dp[row_Index][col_Index+1]=right;
		}else {
			right =dp[row_Index][col_Index+1];
		}
		
		
		
		int myAns=Math.min(down, Math.min(diag, right));
		
		return myAns+input[row_Index][col_Index];// path complete when i include my working cell.
		
		
		
			
	}

	// I.D.P
	public static int minCost(int input[][]) {
		
		
		
		int m=input.length;
		int n=input[0].length;
		
		int dp[][]=new int[m+1][n+1];// +1 for tackle invalid cell and find out kar sake min from than also;
		
		
		//base case said fill +infinity to row>=m and col>=n,so we filled initial all by this
		// but when we find each cell value we chage every value except row>=m and col>=n
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=Integer.MAX_VALUE;
						
			}
		}
		
/* answer dp[0][0]; 
 * because path complete there ,base case hit at last cell of input return hhonae start 	
 * from there so we also start creating from there.
	
	*/
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				
				//special case
				// if i don't use this case so min for this cell +infinity ans wrong.
				if(i==m-1&&j==n-1) {
					dp[i][j]=input[i][j];
					continue;
				}
				
				int ans1=dp[i+1][j];//down
				int ans2=dp[i][j+1];//right
				int ans3=dp[i+1][j+1];//diagonal
				int myAns=Math.min(ans1, Math.min(ans2, ans3));
				
				dp[i][j]=input[i][j]+myAns;// store further use ny anyone
						
			}
			


		}
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		int a[][]= {{1,5,11},{8,13,12},{2,3,7}};
   
	/*1*/	System.out.println(minCost(a, 0, 0));
		
		int dp[][]=new int[a.length+1][a[0].length+1];
		// dp store array type value
			for(int i=0;i<dp.length;i++) {
				for(int j=0;j<dp.length;j++) {
					dp[i][j]=Integer.MAX_VALUE;
				}
				
		}
	
	/*2*/	System.out.println(minCost(a, 0, 0, dp));
		  // 0 index row a = store n n. of 1D array every 
	     // 1D array store Array as value in its particular storage; ==  2D array is created
	
	
   /*3*/	System.out.println(minCost(a));
	System.out.println("jnn"+"\n"+"hh"); // line separator == delimeter back slash n ==  "\n" ,always inside string
	}
}
