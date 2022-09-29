package applicationOfHashMap;

import java.util.HashMap;

@SuppressWarnings("unused")
public class PrintSumToZero {

	public static void main(String[] args) {
		int a[]= {-2,2,6,-2,2,-6,3};//{2,1,-2,2,3};
		
//		System.out.println(-(-2));
		int answer=sumToZero(a);
		int answer2=sumToZero2(a);
		System.out.println(answer2);
     	System.out.println(answer);
		
	}


    private static int sumToZero2(int[] a) {
		
		HashMap<Integer,Integer> m =new HashMap<>();
	
		Integer output=0;
		for(int i=0;i<a.length;i++) {
			
			if(m.isEmpty()) {
				m.put(a[i], 1);
				
			}else if(m.containsKey(-a[i])) {
				if(m.containsKey(a[i]))
				output+=m.get(-a[i]);
				
				if(m.containsKey(a[i])) { /// check already map has that key element or not
					
				m.put(a[i],m.get(a[i]+1) );
				}
				
				else {
					m.put(a[i],1);// futher frq store
				}
				
			}else 
				m.put(a[i], 1);
			
			
		}
		
		return output;
	}

    private static int sumToZero(int[] a) {
		
		HashMap<Integer,Integer> m= new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);	
			}else
				m.put(a[i], 1);
		}
		
		
		int output=0;
		for(int i=0;i<a.length;i++){
			
			int input= -(a[i]);
			
			if(m.containsKey(input) ){
				int frq=m.get(input);
				
				if(frq>0) {
//				System.out.println(frq);
				output+=1;
				m.put(input, frq-1);
				}
			}
			
		}
		
		
		
		return output;
		
	
	}


}
