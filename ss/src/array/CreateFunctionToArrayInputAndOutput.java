package array;

import java.util.Scanner;

public class CreateFunctionToArrayInputAndOutput {
	
	public static void outputArray(int b[]) {
		int n=b.length;
		for(int i =0;i<n;i++) {
				System.out.println(b [i] );
		}
	}
	
public static int [] inputArray() {// [] int not possible in function
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int [] inputArray=new int[n];
	
	for(int i =0;i<n;i++) {
		inputArray [i]=s.nextInt();	
	
	}
	return inputArray;
}
	public static void main(String[] args) {
		int a[];
		a=inputArray();
			outputArray(a);

	}

}
