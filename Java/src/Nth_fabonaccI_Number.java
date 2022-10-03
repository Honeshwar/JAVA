package fundamental;

import java.util.Scanner;

public class Nth_fabonaccI_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int firstNumber=1,secondNumber=1,answer=0;
		for(int i=1;i<=n;i++) {// n-2
			if(i==n ) {
				System.out.println(firstNumber);
			}
			else if(i==n){
				System.out.println(firstNumber);
				
			}
				else {
			
			answer=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=answer;
			if(i==n) {
				System.out.println(answer);
			}
			}
		}

	}

}
