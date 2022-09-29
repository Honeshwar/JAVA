package applicationOfHashMap;

import java.util.*;

 class Solution {
	 
	 
	  
    /*
6
     * Time complexity: O(N) 
7
     * Space complexity: O(N)
8
     * 
9
     * where N is the size of the input array
10
     */

    public static int getPairsWithDifferenceK(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
        int pairCount = 0;
 
        for(int i : arr){
 
            int p1 = i + k;
  
            boolean flag = false;
  
            if(i == p1) {
 
                flag = true;
 
            }
  
            if(map.containsKey(p1)){
  
                pairCount += map.get(p1);
   
            }
 
            int p2 = i - k;
 
            if(map.containsKey(p2) && !flag){
 
                pairCount += map.get(p2);
 
            }
   
            if(map.containsKey(i)){
  
                map.put(i, map.get(i) + 1);
  
            }else{
  
                map.put(i, 1);
  
            }
 
        }
 
        return pairCount;
   
    }
   
}

 class Solution1 {

	public static int getPairsWithDifferenceK(int arr[], int k) {
	
	int n=arr.length;
	if(n == 0)
		return 0;
	// if(k==0)
	// 	return n;
	
	
	HashMap<Integer, Integer> h= new  HashMap<Integer, Integer>();
	
	for(int i=0;i<n;i++) {
		
		if(h.containsKey(arr[i])) {
			int value = h.get(arr[i]);
			h.put(arr[i], value+1);
		}
		else
		h.put(arr[i], 1);
	
	}
	
	
	int count=0;
	for(int i=0;i<n;i++) {
        
if(h.get(arr[i]) == 0)
continue;
        
if(h.get(arr[i]) == n ){ // key ==> value get
count =  (n)*(n-1)/2;
break;
}
        
int find = arr[i] - k;
int find2 = arr[i] + k;
		
        
  int del=arr[i];
while(h.containsKey(find) && h.get(find)>0){
count= count+ h.get(del) * h.get(find);
               
			  
 del=find;            
find = find - k;
h.put(del,0);
    
}
         del=arr[i];
while(h.containsKey(find2) && h.get(find2)>0){
count= count+ h.get(arr[i]) * h.get(find2);
               
// h.put(find2,0);
			  
 del=find2;            
find2 = find2 + k;
h.put(del,0);
    
}
		
 		
		
		
		
		
	}
	
	
	
	
	
	
	
	return count;
		
}



	public class Solution {

		public static int getPairsWithDifferenceK(int arr[], int k) {
		
		int n=arr.length;
		if(n == 0)
			return 0;
		// if(k==0)
		// 	return n;
		
		
		HashMap<Integer, Integer> h= new  HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(h.containsKey(arr[i])) {
				int value = h.get(arr[i]);
				h.put(arr[i], value+1);
			}
			else
			h.put(arr[i], 1);
		
		}
		
		
		int count=0;
		for(int i=0;i<n;i++) {
            
	if(h.get(arr[i]) == 0)
	continue;
            
	if(h.get(arr[i]) == n ){ // key ==> value get
	count =  (n)*(n-1)/2;
	break;
	}
            
	int find = arr[i] - k;
	int find2 = arr[i] + k;
			
            
	  int del=arr[i];
	while(h.containsKey(find) && h.get(find)>0){
	count= count+ h.get(del) * h.get(find);
                   
				  
     del=find;            
	find = find - k;
    h.put(del,0);
        
	}
             del=arr[i];
	while(h.containsKey(find2) && h.get(find2)>0){
	count= count+ h.get(arr[i]) * h.get(find2);
                   
	// h.put(find2,0);
				  
     del=find2;            
	find2 = find2 + k;
    h.put(del,0);
        
	}
			
	 		
			
			
			
			
		}
		
		
		
		
		
		
		
		return count;
			
	}
	
	}







}







public class PairsWithDifferenceK {

	
		
	public static int getPairsWithDifferenceK(int arr[], int k) {
		int n=arr.length;
		if(n == 0)
			return 0;
		if(k==0)
			return n;
		
		
		HashMap<Integer, Integer> h= new  HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(h.containsKey(arr[i])) {
				int value = h.get(arr[i]);
				h.put(arr[i], value+1);
			}
			else
			h.put(arr[i], 1);
		
		}
//		int j=0;
//		while(!h.isEmpty()) {
//			
//			int a=h.remove(arr[j]);
//			System.out.print(a+" ");
//			j++;
//		}
		
		
		
		int count=0;
		for(int i=0;i<n;i++) {
			
			int find = arr[i] - k;
			
			if(h.containsKey(find)) {
				
				while( h.get(arr[i]) > 0 && h.get(find ) > 0) {//h.get(arr[i]) > 0 &&
				count++;
				h.put(arr[i],h.get(arr[i])-1);
				h.put(find,h.get(find)-1);
				
				}
				
			}else {
				continue;
			}
				
			
			
		}
		
		
		
		
		
		
		
		return count;
			
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		int a[]= {5,1,2,4,5,1};
		System.out.println(getPairsWithDifferenceK(a, 4));
		System.out.println(Math.abs(a[5]-1));
	}
}
