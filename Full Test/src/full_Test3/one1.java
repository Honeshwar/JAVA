package full_Test3;

import java.util.*;

public class one1 {
	
	private static void superPrimePrint(int n) {

		ArrayList<Integer> a = new ArrayList<Integer>();// we don't know how many prime are there in n.
		HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
		// arraylist to store prime
		// hash map key = position of prime no. and value = prime no.
		// position grap ke liya use kiya hai
		
		int count=0;
		// represent each no's
		for(int i=2;i<=n;i++) {
			// represent each no's is divisible by itself or not
			int j=2;// previous no's se divisible toh nahi hai check
			for(;j<i;j++){
				if(i%j==0)
					break;
			}
				if(i%j==0 && i==j) {
					a.add(i);
					m.put(++count,i);
					
				}
				
		}
		int size=a.size();
		//a.get(i)<size because position less that its size
		for(int i=0;i<size;i++) {// all prime positon get from list and h.m se print that position prime no
			int primePosition = a.get(i);
			Integer ans=m.get(primePosition);
			if(ans==null)
				continue;
			
			System.out.print(ans+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
//	for(int i=0;i<a.size();i++) {
//		System.out.print(a.get(i)+" ");
//	}
//	}
//		if(i%j==0)// divisible hai
//		{
//			if(i==j) {
//				a.add(i);
//				m.put(++count,i);
//				count++;
//		}else     // that no's is divisible by other no also
//			break;
//	}
	
	static int i=2;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		
		superPrimePrint(N);
		
		
		
		
	}

	

	
}
