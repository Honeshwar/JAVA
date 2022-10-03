package full_Test3;

import java.util.Scanner;

public class one3{
	public class Solution {
		public static void main (String[] args) {
		    Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        
	        int a[] = new int[N];
	        
	        for(int i=0;i<N;i++){
	         a[i]=s.nextInt();
	        
	        }
	        
	      int answer =  removeOneElementAndResultantSumIsEvenInArray(a,N);
	        System.out.println(answer);

		}
	    
	    
	    
	    
	    static int removeOneElementAndResultantSumIsEvenInArray(int []a, int n){
	        
	        int count=0;
	       
	         for(int i=0;i<n;i++){
	              int sum=0;
	            for(int j=0;j<n;j++){
	                if(i==j)
	                    continue;
	                
	                sum += a[j];
	            }
	             if(sum>0 && sum%2==0){
	                 count++;
	             
	         }
	        
	      
	        
	    }
	          return count;
	}
	}
}