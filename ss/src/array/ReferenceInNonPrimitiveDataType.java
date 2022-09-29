package array;

import java.util.Scanner;

public class ReferenceInNonPrimitiveDataType {
	public static void outputArray(int b[]) {
		int n=b.length;
		for(int i =0;i<n;i++) {
				System.out.println(b [i] );
		}
	}
	
public static int [] inputArray(int a[]) {// [] int not possible in function
	a=new int [8];// reference change//new array create with default value 0.
	for (int i=0;i<a.length;i++) {// reference inside stored things change
		a[i]=a[i]+1;
		
	}System.out.println("function reference"+a);
	return a;}// reference return
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("main reference"+a);
		inputArray(a);//reference pass to function not value because 
		//in case of non primitive data type variable store reference
		outputArray(a);	
		
		a=inputArray(a);	// reference of 'a' change into function reference
		System.out.println("again main reference after taking function reference"+a);
			outputArray(a);
			
			
//				all about reference
			
//		 int arr[] = {1,2,5,4,5};
			 //System.out.println(arr);//reference
//			     arr[1] = 10;
//			     arr = new int[2];
//			     System.out.println(arr[0]);  
	}

}
