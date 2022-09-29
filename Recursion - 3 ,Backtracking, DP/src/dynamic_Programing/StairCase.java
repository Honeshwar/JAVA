package dynamic_Programing;

public class StairCase {

	public static long stairCase(int n) {
		if(n==0||n==1||n==2) 
			return n;
		if(n==3)
			return 4;// 1 step a time = 3 time (hop) jump   , 2 step a time =1 time
		
		// n-4, 4 step a time include kara  n==4 return 4+2+1=7step total.
		
		
		// our calculation base case include or edge case;
		// n==1 return 1 , one stair move now you move n-1 stair 
		// n==2 return 2 , two stair move now you move n-2 stair 
		// n==3 return 4(no. of possible way=4 in this case) , three stair move now you move n-3 stair 
		long step1=stairCase(n-1);
		long step2=stairCase(n-2);
		long step3=stairCase(n-3);
		
		return step1+step2+step3;
		
		
		
	}

	
	public static long stairCaseHelper(int n) {
		return 0;
	}
	
	  private static long staircaseHelper2(int n){
	        if(n <= 0 || n==1){
	            return 1;
	        }        
	        if(n == 2){
	            return 2;
	        }
	        if(n == 3){
	            return 4;
	        }
	        
	        
	        long dp[] = new long[n+1];
	        dp[0] = dp[1] = 1;
	        dp[2] = 2;
	        dp[3] = 4;
	        
	        for(int i=4;i<=n;i++){
	            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
	        }
	        
	        return dp[n];
	    }
		public static long staircase(int n) {
			//Your code goes here
	        long dp[] = new long[n+1];
	        // for(int i=0;i<=n;i++)
	        //     dp[i] = -1;
	        // return staircaseHelper(n,dp);
	        
	        return staircaseHelper2(n);

		}

	     
	 	public static long staircase2(int n) {
	 		//Your code goes here
	         if(n<0)
	             return 0;
	         if(n == 0){
	             return 1;
	         }
	        
	         long ans1 = staircase(n-1);
	         long ans2 = staircase(n-2);
	         long ans3 = staircase(n-3);
	        
	         return ans1+ans2+ans3;
	        
	 	}
public static void main(String[] args) {
	System.out.println(stairCase(10));
}
}
