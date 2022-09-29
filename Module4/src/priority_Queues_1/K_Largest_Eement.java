package priority_Queues_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Largest_Eement {

	public static void main(String[] args) {
		
		int a[]= {32,4,5,8,9,0,1,32,3};
		
		ArrayList<Integer> output=kLargest(a,4);
		int i=0;
		for(;i<4;i++) {
			System.out.print(output.get(i)+" ");
		}

	}

	/*
	Time complexity: O(N * log(K))
	Space complexity: O(K)

	where N is the size of the input array
	and K is the number of smallest elements that are to be found
	 */
	
	
	private static ArrayList<Integer> kLargest(int[] a, int k) {
		if(a.length==0 || k==0)
		return new ArrayList<>();
		
		
		PriorityQueue<Integer> kElement = new PriorityQueue<>();
		
		// k element pq
		int i=0;
		for(;i<k;i++) {
			kElement.add(a[i]);
		}
		
		//  add one by one but before check whether min among CBT is less than newely added element.
		
		while(i<a.length) {
		  int min=kElement.peek();
		  
		  if(min<a[i]) {
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

	public static ArrayList<Integer> kLargest2(int a[], int k) {
        if(a.length==0 || k==0)
		return new ArrayList<>();
		
       
       Arrays.sort(a);
       
       int index =a.length-k;
       
       ArrayList<Integer> output =new ArrayList<>();
       for(int i=index;i<a.length;i++){
           output.add(a[i]);
       }
       
       return output;
   }
   
}
