package applicationOfHashMap;

import java.util.*;

public class LargestConsecutiveSequence {
	
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
		int n=arr.length;
		if(n == 0)
			return new ArrayList<>();
		
		
		HashMap<Integer, Boolean> h = new HashMap<Integer, Boolean>();
		
		for(int a : arr) 
			h.put(a, true);
		
		
		int maxLength = 0;
		int startElement = 0;
		int endElement = 0;
		
//		int i=0; // i = currentIndex;
		
		for(int i=0;i<n;i++) {
			int maxLength1 = 0;
			int startElement1 = 0;
			int endElement1 = 0;
			
			
		int currentElement = arr[i];
		
		if(!h.get(currentElement)) // == false , so continue;
			continue;
		
		// right consecutive 2 , 3 4 5 
		
		endElement1=currentElement;
		maxLength1=1;
		h.replace(currentElement, false);
		
		for(int j=1;j<n;j++) {
			int rightElement=currentElement+j;
		if(h.containsKey(rightElement))
		{
			endElement1 = rightElement;
			maxLength1++;
			h.replace(rightElement, false);
			
			//h.put(rightElement, false); // put use , unique keys exist so insert k case m bhe replace ho ga
		}
		
		else
			
			break;
		
			
			
		}
			
			
		// left consecutive       1 2 3 <-- 4
		
		
		startElement1=currentElement;
//		h.replace(currentElement, false);
		
		for(int j=1;currentElement-j>=0;j++) {
			int leftElement=currentElement-j;
			if(h.containsKey(currentElement-j))
			{
				startElement1 = currentElement-j;
				maxLength1++;
				h.replace(leftElement, false);
			}
			
			else
				
				break;
			
				
				
			}
//			
//		if(  currentElement==startElement1 && maxLength == maxLength1  )
//			
//		{
//			maxLength=maxLength1;
//			startElement=startElement1;
//			endElement=endElement1;
//			
//			
//			
//			
//			
//		}else {
			
		
			if(maxLength <= maxLength1) 
			{
				maxLength=maxLength1;
				startElement=startElement1;
				endElement=endElement1;
			
			}
//		}
		
			
			
		}
		ArrayList<Integer> ans=new ArrayList<Integer>();
		
		ans.add(startElement);
		ans.add(endElement);
			
		return ans;
			
			
			
	}
	
	
	// edge case handel .
	
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence2(int[] arr) {
		HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
		for(int i = 0;i < arr.length;i++) {
			map.put(arr[i],true);
		}
		int maxlength = 0;
		int start = 0;
		for(int i = 0;i < arr.length;i++) {
			if(map.get(arr[i]) == false) {
				continue;
			}
			int len = 1;
			int temp = arr[i];
			int j = 1;
			while(map.containsKey(temp+j)) {
				map.put(temp + j,false);
				len++;
				j++;
			}
			j = 1;
			while(map.containsKey(temp-j)) {
				map.put(temp-j,false);
				len++;
				j++;
			}
			if(len > maxlength) {
				maxlength = len;
				start = temp-j+1;
			}else if(len == maxlength) {
				for(int k = 0;k < arr.length;k++) {
					if(arr[k] == start) {
						break;
					} if(arr[k] == temp-j+1) {
						start = temp-j+1;
						break;
					}
				}
			}
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(start);
		if(maxlength > 1) {
			output.add(start + maxlength-1);
		}
		return output;
    }
   
	
	
	
	public static void main(String[] args) {
		int a[]= {3,7,2,1,9,8,41};
		
		ArrayList<Integer> a1 =longestConsecutiveIncreasingSequence(a);
		
		for(int b : a1)
			System.out.print(b+" ");
		
		
		
	}
}
