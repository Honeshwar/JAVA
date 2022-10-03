package fundamental;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long answer=0,count=0;
        while(n>0) {
        	int remainder=n%2;
        	//result=result+(long)(remainder*Math.power(10,count));
        answer=(long)(remainder* Math.pow(10, count))+answer;
        	count++;
        	n/=2;
        }
        System.out.println(answer);
      
	}

}
