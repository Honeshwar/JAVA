package fundamental;

import java.util.Scanner;

public class SquareRootInIntegral {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        
//	        if (n==0) {
//	        	System.out.println(n);
//	        }
	        
	       int i=0;
	        while(i<=n) {
	        	int answer=i*i;
	        	if(answer==n) {
	        		 System.out.println(i);
	        	break;
	        	}
	        	if (answer<=n) {// < not work
	        	
	        		i++;
	        	}else {
	        		
	        		System.out.println(i-1);
	        		break;// if no break this loop run infinite time i=1, print answer infinite time 
	        	}
	        }
	}

}
