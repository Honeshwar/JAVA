package full_Test3;

import java.util.Arrays;
import java.util.Scanner;

public class one5{
	public class Solution {
		public static void main (String[] args) {
		    
	        
	         Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        
	        int a[] = new int[N];
	        
	        for(int i=0;i<N;i++){
	         a[i]=s.nextInt();
	        
	        }
	        
	      int answer =  minimalPrice(a,N);
	        System.out.println(answer);

		}
	    
	    
	    static int minimalPrice(int a[], int n){
	        
	        Arrays.sort(a);
	        // 4 5 5 5 5 6
	        int min=0;
	        int c=2;
	        for(int i=n-1;i>=0;i--){
	            
	            if(c==0){
	                c=2;
	            continue;
	            }
	            
	            
	            min +=a[i];
	            c--;
	        }
	        return min;
	    }
	}



}