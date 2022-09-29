package recursion_3;

import java.util.Scanner;

public class SubsetSum {
	
	 static boolean isSubsetPresent(int[] arr, int n, int sum){
         if(n==0)
             return true;
         return isSubsetPresentHelper(arr,n,sum,0);
     }
    
    
    static boolean isSubsetPresentHelper(int[] arr, int n, int sum,int i) {

       if(i==n ){
           if(sum==0)
               return true;
           else
               return false;
       }
        
        if(sum == 0)
              return true;
           else if (sum<0)
               return false;
       
        
        boolean included=isSubsetPresentHelper(arr,n,sum-arr[i],i+1);
        boolean excluded=isSubsetPresentHelper(arr,n,sum,i+1); //possible arr[i] sath woh subset nah bana toh try different arr[i+1..]
    
    
    return included || excluded;
    
    }
  
    static boolean isSubsetPresentHelper1(int[] arr, int n, int sum) {
    	
    	boolean dp[][]=new boolean[n+1][sum+1];
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<=sum;j++) {
    			dp[i][j]=false;
    			
    		}
    	}
    	for(int i=0;i<n;i++) {
    		dp[i][0]=true;
    	}
    	
    	for(int i=n-1;i>=0;i--) {
    		for(int sum2=1;sum2<=sum;sum2++) {
    		
    			if(sum2-arr[i]==0)
    				dp[i][sum2]=true;
    			else if(sum2-arr[i]<0)
    				dp[i][sum2]=false;
    			else { // >
    				
    				boolean ans1=dp[i][sum2-arr[i]];
    				boolean ans2=dp[i+1][sum2];
    				
    				boolean myAns= ans1 && ans2;
    				dp[i][sum2]=myAns;
    				
    			}
    		}}
    	
    	return dp[0][sum];
    }
    
    public static void main(String[] args) {
		
    	
    	
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	
    	int a[]=new int [n];
    	
    	for(int i=0;i<n;i++) {
    		a[i]=s.nextInt();
    	}
    	
    	int n2=s.nextInt();
    	
    	System.out.println(isSubsetPresent(a, n, n2));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}

    // solution.
static boolean isSubsetPresent3(int[] arr, int n, int sum) {
	
	boolean dp[][]=new boolean[sum+1][n+1];
	
     //sum=0
   
    for(int i=0;i<=n;i++) {
		dp[0][i]=true;
	}
   // sum!=0
		
    for(int j=0;j<=sum;j++) {
			dp[j][0]=false;
			
		}
    
    for (int i = 1; i <= sum; i++) {
      for (int j = 1; j <= n; j++) {
          dp[i][j] = dp[i][j - 1];
          if (i >= arr[j - 1])
              dp[i][j] = dp[i][j] || dp[i - arr[j - 1]][j - 1];
      }
  }


	
	

	   return dp[sum][n];
	
}

   //iterative bootom up approach 
static boolean isSubsetPresent4(int[] arr, int n, int sum) {
	
	boolean dp[][]=new boolean[n+1][sum+1];
	
       //sum=0
     
      for(int i=0;i<=n;i++) {
		dp[i][0]=true;
	}
     // sum!=0
		
      for(int j=1;j<=sum;j++) {
			dp[n][j]=false;
			
		}
      
      for (int i = n-1; i >=0 ; i--) {
        for (int j = 1; j <= sum; j++) {
            dp[i][j] = dp[i+1][j];// excluded part
            if (j >= arr[i])
                dp[i][j] = dp[i][j] || dp[i +1][j- arr[i ]];// included part 
//            dp[i][j] = dp[i+1][j] || dp[i +1][j- arr[i ]];// included part  work fine
            
            
            
          // dp[i][j] = dp[i+1][j];
            
        /* work fine
          
           SSs
                else if(arr[i]==j)
                    dp[i][j]=true;
                    
                  else if(arr[i]<j){
                        boolean ans1=dp[i+1][j-arr[i]];//include
                        boolean ans2=dp[i+1][j];       // exclude

                        dp[i][j] = ans2 || ans1;
                        
                        
                        
        
                  }
                  
          */
        
        
        
        }
    }


	
	

	   return dp[0][sum];
	
}
}

