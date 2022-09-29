package priority_Queues_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest {

	
	
	public class Solution {

		
	    // using arrays
		public static int kthLargest(int n, int[] a, int k) {
			
	        if(n==0 || k==0)
	            return Integer.MIN_VALUE;

	        
	        
	        Arrays.sort(a);
	        int kthIndex=n-k;
	        return a[kthIndex];
		}
	    
		
	    // using max priority Queue
	    public static int kthLargest2(int n, int[] a, int k){
	            
	             if(n==0 || k==0)
	            return Integer.MIN_VALUE;
				
	            // use max PriorityQueue
	            PriorityQueue<Integer> CBT =new PriorityQueue<>(Collections.reverseOrder());
	             
	            for(int i=0;i<n;i++)
	                CBT.add(a[i]);
	            
	             for(int i=0;i<k-1;i++) // see indexes clearly
	                      CBT.poll();
	 
	        
	            return CBT.peek();
	            
	            
	        }
	    
	    
	    // using min priority Queu
	    public static int kthLarges3t(int n, int[] input, int k){
	    
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
			//The size of PQ will be k
			for (int i = 0; i < k; i++) {
				minHeap.add(input[i]);
			}
			for (int i = k; i < n; i++) {
				if (input[i] > minHeap.peek()) {
					minHeap.poll();
					minHeap.add(input[i]);
				}
			}
			return minHeap.peek();
		}

	}
}
