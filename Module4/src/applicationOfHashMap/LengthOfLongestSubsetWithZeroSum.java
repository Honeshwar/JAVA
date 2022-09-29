package applicationOfHashMap;

import java.util.HashMap;

public class LengthOfLongestSubsetWithZeroSum {
	
	public class Solution1 {

		/*
		 * Time complexity: O(N) 
		 * Space complexity: O(N)
		 * 
		 * where N is the size of the input array
		 */
		
		public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		
	        
	         HashMap<Integer, Integer> map = new HashMap<>();
	 
	        int n = arr.length;
	 
	        
	        for (int i = 1; i < n; i++) {
	 
	            arr[i] += arr[i - 1];
	 
	        }
	  
	        
	        
	        int len = 0;
	 
	        
	        
	        for (int i = 0; i < n; i++) {
	 
	            if (arr[i] == 0) {
	 
	                if (len < i + 1) {
	 
	                    len = i + 1;
	 
	                }
	 
	            } 
	 
	            else if (map.containsKey(arr[i])) 
	 
	            {
	   
	                if (len < i - map.get(arr[i])) {
	 
	                    len = i - map.get(arr[i]);
	 
	                }
	 
	            } 

	            else {

	                map.put(arr[i],i);

	            }

	        }

	        return len;
		}
	        
	        
		
		}
	

	// (wrong) in corner cases
public static int lengthOfLongestSubsetWithZeroSum1(int arr[]) {
		int n = arr.length;
	if(n == 0)
		return 0;
	
	
	HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
	int maxLength=0;
	int sum=0;
	for(int i = 0; i < n; i++) {
		int length=0;
		  sum=sum+arr[i];
		if(!m.containsKey(sum))
		{
			
			if(sum==0) {
				length = i + 1;
			}
			
			m.put(sum, i);
			
			
			
		}else {
			
			length = i - m.get(sum);
			
			
			
		}
		
		if(maxLength < length)
            maxLength=length;		
		
	}
	return maxLength;
	}
	



// both work fine 
public static int lengthOfLongestSubsetWithZeroSum2(int arr[]) {
	int n = arr.length;
if(n == 0)
	return 0;


HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
int maxLength=0;
int sum=0;
for(int i = 0; i < n; i++) {
    
    
    
	int length=0;
	  sum=sum+arr[i];
    
     if(arr[i]==0)
     {
           maxLength = i + 1;
           
     }
    
		if(sum==0) 
        {
			maxLength = i + 1;
            	
		}
    
    
    
	if(!m.containsKey(sum))
	{
		m.put(sum, i);
		
        
	}else
    {
        
       
		length = i - m.get(sum);
		
	}
	
	
    if(maxLength < length)
        maxLength=length;		

    
    }
    return maxLength;
    }

 
public class Solution {

	
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		int n = arr.length;
	if(n == 0)
		return 0;
	
	
	HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
	int maxLength=0;
	int sum=0;
	for(int i = 0; i < n; i++) {
        
        
        
		int length=0;
		  sum=sum+arr[i];
        
         if(arr[i]==0)
         {
               maxLength = i + 1;
               
         }
        
			if(sum==0) 
            {
				maxLength = i + 1;
                	
			}
        
        
        
		if(!m.containsKey(sum))
		{
			m.put(sum, i);
			
            
		}else
        {
            
           
			length = i - m.get(sum);
			
		}
		
		
        if(maxLength < length)
            maxLength=length;		

        
        }
        return maxLength;
        }


	
}


	
	public static void main(String[] args) {
		int a[]= {6,1,5,-8,-4,2,-2};   // {6,3,-1,2,-4,3,1,-1,20};
		
		System.out.println(lengthOfLongestSubsetWithZeroSum2(a));
	}

}
