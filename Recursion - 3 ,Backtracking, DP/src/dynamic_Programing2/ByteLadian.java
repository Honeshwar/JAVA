package dynamic_Programing2;

import java.util.HashMap;

public class ByteLadian {
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        
	       long a[]= new long [(int) (n+2)];
         for(int i=0;i<=n;i++)
             a[i]=-1;
         
	        return bytelandianHelper(n,a,n);
	       
//	        // greedy appproach
//	         long ans1=n/2;
//	         long ans2=n/3;
//	         long ans3=n/4;
	        
//	         long ans=ans1+ans2+ans3;
//	         if(ans>=n)
//	         return ans;
//	         else
//	             return n;
//	 	}

	         //brute force
	        // if(n<=1)
	        //     return n;
	        // return
	        //     Math.max(   n, 
	        //                 bytelandian(n/2,memo) +     
	        //                 bytelandian(n/3,memo)+
	        //                 bytelandian(n/4,memo));
	}
	    
	    public static long bytelandianHelper(long n,long dp[],long i) {//i =0/// no. n
	        
	         if(n<=1) {
	             dp[(int) i]=n;
	            return n;
	         }
	        
	             long ans1,ans2,ans3;
	        if(dp[(int) i]==-1){
	            ans1=bytelandianHelper(n/2,dp,i+1);
	        }else
	            ans1=dp[(int) i];
	   
	             
	        if(dp[(int) i]==-1){
	            ans2=bytelandianHelper(n/3,dp,i+1);
	        }else
	            ans2=dp[(int) i];
	   
	           
	        if(dp[(int) i]==-1){
	            ans3=bytelandianHelper(n/4,dp,i+1);
	        }else
	            ans3=dp[(int) i];
	   
	       
	        
	       return Math.max(n,ans1+ans2+ans3);
		}
	
	    
	    
	    
	    
	    
	    public static long bytelandian2(long n, HashMap<Long, Long> memo) {
            
            
	        
		            if(n<12)
		                return n;
		            
		       long dp[]= new long[(int) (n+1)];
		        
		            
		            
		            
		        
		        for(int i=0;i<12;i++) {
		        	
		        	dp[i]=i;
		        
		        }
		             for(int i=12;i<dp.length;i++) {
		        
		        	dp[i]=Math.max(i, (dp[i/2])  + (dp[i/3]) +(dp[i/4]));
		                 
		                 
		             }
		            
		             return dp[(int) n];
        }  
	    
	    
	   
	    // solution 
	    
	    /*
	    Time complexity: O(log(N))
	    Space complexity: O(log(N))

	    where N is the number of initial bytelandian gold coins
	*/
	
	 class Solution {
	    
		public static long bytelandian(long n, HashMap<Long, Long> memo) {
			if (n <= 1) {

				return n;
			}

	        if (memo.get(n) != null) {
	            return memo.get(n);
	        }

	        long breakDownValue = bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo);

	        memo.put(n,Math.max(n, breakDownValue)); 
	    
	        return memo.get(n);
		}

	}
	    
	    
	    
	    
	    
	    
	    
	    // also some what same
	 
	  public static long bytelandian3(long n, HashMap<Long, Long> memo) {
	        // Write your code here
	        //Handle base case for n=0,1
	        if (n<12)
	        {
	            memo.put(n,n);
	            return n;
	        }
	        
	        if (!memo.containsKey(n))
	        {
	            long ans1=bytelandian(n/2,memo);
	        	long ans2=bytelandian(n/3,memo);
	        	long ans3=bytelandian(n/4,memo);
	        
	        	long currVal=ans1+ans2+ans3;
	        	if (currVal>n)
	            	memo.put(n,currVal);
	        	else
	            	memo.put(n,n);
	            
	        }
	        
	        return memo.get(n);
	    }
	       /*
	        //Recursive solution
	        
	        memo.put((long)0,(long)0);
	        memo.put((long)1,(long)1);
	        
	        for (int i=2;i<=n;i++)
	        {
	            long ans1=memo.get(i/2);
	            long ans2=memo.get(i/3);
	            long ans3=memo.get(i/4);
	            
	            long currentVal=ans1+ans2+ans3;
	            if (currentVal>i)
	            {
	                memo.put((long)i,currentVal);
	            }
	            else
	            {
	                memo.put((long)i,(long)i);
	            }
	        }
	        
	        return memo.get(n);
	        */    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
