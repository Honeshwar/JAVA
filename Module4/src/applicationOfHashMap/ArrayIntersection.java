package applicationOfHashMap;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersection {
public static void main(String[] args) {
	int a[]= {1,3,4,6,1,2};
	int b[]= {4,3,9,4,8,1,2};
	
	arrayIntersection(a,b);
	System.out.println();
	arrayIntersection2(a,b);
}

private static void arrayIntersection2(int[] a, int[] b) {
	
	HashMap<Integer,Integer> m= new HashMap<Integer, Integer>();
	
	//first array and put one by one
	for(int i=0;i<a.length;i++) {
		
		if(m.containsKey(a[i]))
			m.put(a[i], m.get(a[i])+1);
		else	
		m.put(a[i], 1);
		
	}
	
	// second arr element ka interssection ko find in map
	for(int i=0;i<b.length;i++) {
		
		if(m.containsKey(b[i]) && m.get(b[i]) > 0) {// intersection element  are pesent in map and its frequency should atleast 1
			System.out.print(b[i]+" ");
			m.put(b[i], m.get(b[i]) -1);// -1 for one interesection happen
		}
	}
	
	/*
     for(int i=0;i<b.length;i++) {
    	 
		if(m.containsKey(b[i]) ) {
			
			int frequency=m.get(b[i]); 
			// no null poin exception because if(m.containsKey(b[i]) ) 
			 //  handel that , that is way to use get method so no null exception occur
			
			if(frequency > 0) {
				
			System.out.print(b[i]+" ");			
			m.put(b[i], frequency -1);
			
			}
		}
	}
	*/
}

private static void arrayIntersection(int[] a, int[] b) {
	Arrays.sort(a);// nlogn
	Arrays.sort(b);// mlogm
	
	for(int i=0,j=0;i<a.length;) {
//		if(i==a.length || i==b.length)
//			break;
		if(a[i] ==b[j]) {
			System.out.print(a[i]+" ");
		i++;j++;	
		}
		else if(a[i] < b[j])
			i=i+1;
		else
			j+=1;
	}
	
}


}
