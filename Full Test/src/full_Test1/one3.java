package full_Test1;

import java.util.ArrayList;

public class one3 {

	
	
	   static ArrayList<Integer> mergeTwoArray(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		     
			int n1=arr1.size(),n2=arr2.size();
			int n3=n1+n2;
			
			  ArrayList<Integer> arr3 = new ArrayList<Integer>();// reference created memory m
			
			
			int i=0,j=0,k=0;
			while(i<n1 && j<n2) {
				if (arr1.get(i)<=arr2.get(j)) {
					arr3.add(arr1.get(i));
					i++; k++;
				}else {
					arr3.add(arr1.get(j));
				j++;k++;
				}
				
			}
			while(i<n1) {
				arr3.add(arr1.get(i));
				i++;k++;
			}
			while(j<n2) {
				arr3.add(arr1.get(j));
				j++;k++;
			}
			
			return arr3;
		}

}
