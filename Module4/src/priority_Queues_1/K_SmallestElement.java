package priority_Queues_1;
import java.util.*;
public class K_SmallestElement {

	/*
	Time complexity: O(N * log(K))
	Space complexity: O(K)

	where N is the size of the input array
	and K is the number of smallest elements that are to be found
	 */
	public class Solution {

		public static ArrayList<Integer> kSmallest(int n, int[] a, int k) {
			
	        if(a.length==0 || k==0)
			return new ArrayList<>();
			
			
			PriorityQueue<Integer> kElement = new PriorityQueue<>(Collections.reverseOrder());
			
			// k element pq
			int i=0;
			for(;i<k;i++) {
				kElement.add(a[i]);
			}
			
			//  add one by one but before check whether min among CBT is less than newely added element.
			
			while(i<a.length) {
			  int min=kElement.peek();
			  
			  if(min>a[i]) {
				  kElement.poll();// min remove
				  kElement.add(a[i]);
				  
			  }
			  
			 
			  i++;
			  
			}
			
			
			ArrayList<Integer> ans= new ArrayList<Integer>();
			
			while(!kElement.isEmpty()) {
				int element=kElement.poll();
				ans.add(element);
			}
			return ans;

		}


	    
	    
//	 	public static ArrayList<Integer> kSmallest(int n, int[] a, int k) 
//	     {
//	 	if(a.length==0 || k==0)
//	 	return new ArrayList<>();
			
	        
//	 	Arrays.sort(a);
	        
//	 	int index =a.length-k;
	        
//	 	ArrayList<Integer> output =new ArrayList<>();
//	 	for(int i=0;i<k;i++){
//	 	output.add(a[i]);
//	 	}
	        
//	 	return output;

	// }





	}
}
