package dynamic_Programing2;

public class Ways_To_Make_Coin_Change {
// both time complexity exponential hai, T(N)=O(N^V)  OR O(SIZE OF INPUT ARRAY raised to power V(value of coin exchnge);
	public static int ways(int input[],int V,int i) {
		if(i==input.length)
			return 0;
		
		if(V==0)
			return 1;
		
		
		int ans;
		if(input[i]<=V) {
			int ans1=ways(input, V-input[i], i);// include i=0,....but point i=i;
			int ans2=ways(input, V, i+1);// exclude i=0,...and i=i+1
			ans=ans2+ans1;
			
		}else {//input[i]>V
			ans=ways(input, V, i+1);
		}
		return ans;
	}
	//demonizATION
	   public static int ways(int input[],int V,int i,int dp[][]) {
			if(i==input.length)
				return 0;
			
			if(V==0){
	            
	            dp[i][V]=1;
				return 1;
	        }
	            
			
			
			int ans;
			if(input[i]<=V) {
	            int ans1=0;
	            if(dp[i][V-input[i]]==0){
				ans1=ways(input, V-input[i], i,dp);// include i=0,....but point i=i;
	            }
	            else
	                ans1=dp[i][V-input[i]];
				int ans2=0;
	                 if(dp[i+1][V]==0){
	               ans2 =ways(input, V, i+1,dp);// exclude i=0,...and i=i+1
	                 } 
	            else
	                ans2=dp[i+1][V];
				
			        	ans=ans2+ans1;
				
			}else {//input[i]>V
	            if(dp[i+1][V]==0)
				ans=ways(input, V, i+1,dp);
	            else
	                  ans=dp[i+1][V];
	                
			}
			return ans;
		}
		
	   
	   
	
	 // iterative
/*       
	   T(N)=O(m*n);
 
    Time Complexity: O(mn)
 
    Space Complexity: O(mn)
 
    where n is number of demoninationsa and m is the value inputted
6
*/
	public static int ways(int input[],int V) {
		int n=input.length;
		int dp[][]=new int [n+1][V+1];
		
	
	for(int i=n-1;i>=0;i--) {
		
		//special case
		
			dp[i][0]=1;
		}
		for(int i=n-1;i>=0;i--) {
			for(int v=0;v<=V;v++) {
				
				int ans;
				
				
				if(input[i]<=v) {
					
					int ans1=0;
					
					if(input[i]==v) {
					ans1=1+dp[i][v-input[i]];
					}
					else
						ans1=dp[i][v-input[i]];
						
					
					int ans2=dp[i+1][v];
					ans=ans1+ans2;
				}
				else {
					ans=dp[i+1][v];
				}
				
				dp[i][v]=ans;
				
				
			}}
		return dp[0][V];
	}
	
 class Solution {
		 
	    public static int countWaysToMakeChange(int denominations[], int value){
	  
	        int n = denominations.length;
	 
	        int ways[][] = new int[n][value + 1];
	 
	        for(int i = 0; i < n; i++){
	 
	            ways[i][0] = 1;
	 
	        }
	 
	        for(int i = n-1; i >=0 ; i--){
	 
	            for(int j = 1; j <= value; j++){        
	 
	                int count1 = 0;
	 
	                if(i + 1 <= n - 1){
	 
	                    count1 = ways[i + 1][j] ;
	 
	                }
	  
	                int count2 = 0;
	 
	                if(j - denominations[i] >= 0){
	 
	                    count2 = ways[i][j - denominations[i]];
	 
	                }
	 
	                ways[i][j] = count1 + count2;
	 
	            }
	 
	        }
	 
	        return ways[0][value];

	    }

	    

	}

 
 
 
 
 
 
 
 public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println(ways(a, 250, 0));
		System.out.println(ways(a, 250));
//		System.out.println(ways(a, 250, 0, new int [a.length+1][250+1]));
	}
}
