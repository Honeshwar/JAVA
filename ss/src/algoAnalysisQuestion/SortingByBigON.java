package algoAnalysisQuestion;

import java.util.Scanner;

public class SortingByBigON {
	public static int [] sortingByBigON(int []arr) {
for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp =arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			}
			
			
		}return arr;
	}
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		int n[]= {9,8,7,6,5,4,3,2,1};
		n=sortingByBigON(n);// same reference
for(int i:sortingByBigON(n)) {
	System.out.print(i+" ");
}
	}

}
