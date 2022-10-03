package full_Test1;
import java.util.*;
public class one4 {

	public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
		HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n1;i++) {
			
			if(m.containsKey(arr1[i])){
				
				m.replace(arr1[i], m.get(arr1[i])+1);
			}
			else
			m.put(arr1[i], 1);
		}
		boolean flag = false;
		for(int i=0;i<n2;i++) {
			
			if(m.containsKey(arr2[i]) && m.get(arr2[i])!=0) {
				m.replace(arr1[i], m.get(arr1[i])-1);
				flag=true;
			}
			else
				return false;
		}
		
        return flag;
       
	}
}
