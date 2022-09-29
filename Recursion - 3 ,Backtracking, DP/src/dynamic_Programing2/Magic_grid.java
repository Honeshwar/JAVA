package dynamic_Programing2;

public class Magic_grid {

	int magic(int grid[][]) {
		
		  int row=grid.length;
	        if (row==0)
	            return row;
	        
	        int col=grid[0].length;
	        if (col==0)
	            return col;
	        
	        int[][] dp=new int[row][col];
	        dp[row-1][col-1]=1;
	        
	        for (int i=col-2;i>=0;i--)
	        {
	        	dp[row-1][i]=dp[row-1][i+1]-grid[row-1][i];
	            
	        }
	        for (int i=row-2;i>=0;i--)
	        {
	            dp[i][col-1]=dp[i+1][col-1]-grid[i][col-1];
	        }
	        
	        
	        for(int i=row-2;i>=0;i--)
	        {
	            for (int j=col-2;j>=0;j--)
	            {                
	                int ans1=dp[i+1][j];
	                int ans2=dp[i][j+1];
	                
	                dp[i][j]=Math.max(1,Math.min(ans1,ans2)-grid[i][j]);
	            }
	        }
	        
	        return dp[0][0];


	    }
		
	   public static int getMinimumStrength(int[][] grid) {
	        
	        /*
	 
	            dp[i][j] stores the minimum strength required to reach 
	 
	            bottom right corner of grid from the index (i, j)
	 
	        */
	 
	        int n = grid.length;
	  
	        int m = grid[0].length;
	  
	        int[][] dp = new int[n + 1][m + 1];
	 
	        for (int i = 0; i <= n; ++i) {
	 
	            for (int j = 0; j <= m; ++j) {
	 
	                dp[i][j] = Integer.MAX_VALUE;
	 
	            }
	  
	        }
	 
	        dp[n][m - 1] = 1;
	 
	        dp[n - 1][m] = 1;
	  
	 
	        for (int i = n - 1; i >= 0; --i) {
	 
	  
	            for (int j = m - 1; j >= 0; --j) {
	  
	                // 'neededStrength' stores the minimum strength needed to survive
	  
	                int neededStrength = Integer.min(dp[i + 1][j], dp[i][j + 1]) - grid[i][j];
	  
	                dp[i][j] = (neededStrength <= 0) ? 1 : neededStrength;
	  
	            }
	  
	        }
	 
	        int ans = dp[0][0];
	 
	        return ans;
	    }
	
	   
	   
	   public static int getMinimumStrength2(int[][] grid) {
		   
		   int m=grid.length;
		   if(m==0)
			   return m;
		   int n=grid[0].length;
		   if(n==0)
			   return n;
		   
		   int dp[][]=new int[m+1][n+1];
		   
		   // fill initial 2D by default value as +infinity because we have to find minimum (strength);
		   // at the end fill 2D one by one
		   for(int i=0;i<dp.length;i++) {
			   for(int j=0;j<dp[i].length;j++) {
				   dp[i][j]=Integer.MAX_VALUE;
			   }
		   }
		   
		   
		   
		   
		   //base case
		   // destination cell  right and left cell
		   dp[m][n-1]=1;
		   dp[m-1][n]=1;
		   
		   // destination cell start
		   for(int i=m-1;i>=0;i--) {
			   for(int j=n-1;j>=0;j--) {
				
		   
		   int neededStrength;
		   
		   int ans1=dp[i][j+1];
		   int ans2=dp[i+1][j];
		   neededStrength=Integer.min(ans1, ans2)-grid[i][j];//integer call within it Math.min finction ,
		   
		   if(neededStrength<=0)
			   dp[i][j]=1;
		   else
			   dp[i][j]=neededStrength;
		   
		  
		   
	   }
		   }
	   return dp[0][0];
	
}


public static void main(String[] args) {
	int a[][]= {{0,1,-3},{1,-2,0}};
	
	System.out.println(getMinimumStrength2(a));
}
}