package array;

import java.util.Scanner;

public class Array {
	
public static void main (String args[]) {
	
	Scanner s = new Scanner(System.in);
	int[] arr = new int[5];
	arr = new int[6];
	int length = arr.length;
	
	// by default values
	System.out.println(length+" "+(arr [0]=1)+" "+(arr[5]=9)); 
	System.out.println(arr[1]);
	double []dArray=new double[5];
	char cArray[]=new char[5];
	String [] sArray=new String[5];
	boolean a[]=new boolean[5];
	System.out.println(a[3]);
	System.out.println(dArray[3]+"\n "+cArray[3]+"\n"+sArray[3]);
}
}
