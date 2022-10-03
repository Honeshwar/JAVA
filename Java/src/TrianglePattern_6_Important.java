package fundamental;

import java.util.Scanner;

public class TrianglePattern_6_Important {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        byte n=s.nextByte();
        byte i=1;
        
        while(i<=n) {
        	byte spaces=1;
        	while(spaces<=n-i) {
        		System.out.print(" ");
        		spaces++;
        		
        	}
        	byte j=i;byte count=0;
        	while(j>=i) {
        		
        		count=(byte)(count+1);
        		if (count<=i) {     // ith row ma i number  needed 
        		System.out.print(j);}
        		j++;
        	}
        	byte decrease=(byte) (2*i-2);
        
        		while(decrease>=i) {
        			System.out.print(decrease);
        			decrease--;
        		}
        		
        	
        	System.out.println();
        	i++;
        }
	
	
	
	}

}
