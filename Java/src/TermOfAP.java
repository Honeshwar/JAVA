package fundamental;

import java.util.Scanner;

public class TermOfAP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int firstTerm;int count=0;
        if (x==0) {
        	
        }else {
        for(int i=1;i>0;i++) {
             firstTerm=3*i+2;
        
        	if(firstTerm%4!=0) {
        		count=count+1;
        		System.out.print(firstTerm+" ");
        	}
        	if (count==x) {
        		break;
        	}
        	
        	
        }
        }
	}

}
