package applicationOfHashMap;


import java.util.HashMap;
import java.util.Set;

public class Max_Frequency_Number {

	
	public static void main(String[] args) {
		
	       int arr[]= {1,2,2,1,2,3};
		int a=maxFrequencyNumber(arr);
         System.out.println(a);
		}

	private static int maxFrequencyNumber(int[] arr) {
		
		HashMap<Integer,Integer> m=new HashMap<>();
		
		
		for(int i=0;i<arr.length;i++) {
//			int n=0;
			if(m.containsKey(arr[i]))
				m.put(arr[i], m.get(arr[i])+1);
			else	
			m.put(arr[i], 1);
			
		}
		Set<Integer> keys=m.keySet();
		int max=0;
		int output=0;
		for(Integer n:keys) {
			
			if(max<m.get(n)) {
				max=m.get(n);
				output=n;
			}
			
		}
			
		
		return output;
	}

	}


