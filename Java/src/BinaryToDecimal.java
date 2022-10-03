package fundamental;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int result=0,count=0;
        
        while(n>0) {
        	int temp=n%10;
        	result=(int)(temp* Math.pow(2, count))+result;
        	count++;
        	n/=10;
    
        }
        System.out.println(result);
	}

}
