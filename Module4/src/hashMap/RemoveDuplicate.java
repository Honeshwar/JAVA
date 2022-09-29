package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		/*
		 int arr[]= {1,2,3,4,5,4,3,21,5,6,7,8,09,9,8,6,5};
		 
		 // 09 , 4byte=32bits  (0)00000000000000000000000000000...1001, 
		 //  33bits equals due o(0) range not valid(0 to 32bites)
         
         int b =09;
	*/
		
       int arr[]= {1,2,3,4,5,4,3,21,5,6,7,8,9,9,8,6,5};
		// arraylist use because dulpicate get remove we csnnot pridict fixt size.
       ArrayList<Integer> output = removeDuplicate(arr);
       
	System.out.println(output);
	}

	private static ArrayList<Integer> removeDuplicate(int[] arr) {
		if(arr.length==0)
			return null;
		
		   ArrayList<Integer> output=new ArrayList<Integer>();
		   HashMap<Integer,Boolean> m=new HashMap<Integer, Boolean>();
		   for(int i=0;i<arr.length;i++) {
			   if(m.containsKey(arr[i]))
				   continue;
		  
		   output.add(arr[i]);// i=reference store of Integer wrapper class ka
		   m.put(arr[i], true);
		   }
		return output;
	}

}
