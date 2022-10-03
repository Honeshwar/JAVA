package fundamental;

import java.util.Scanner;

public class ReverseNumberPatterns4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        byte n=s.nextByte();
        byte i=1;
        while(i<=n) {
        	byte j=1;
        	byte p=i;
        	while(j<=i) {
        		System.out.print(p);
        		p--;
        		j++;
        		
        	}System.out.println(); i++;
        	
        	
        }
        

        
	
	}

}
