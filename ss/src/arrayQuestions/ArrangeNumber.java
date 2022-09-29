package arrayQuestions;

import java.util.Scanner;

public class ArrangeNumber {
	public static void arrangeNumber(int a[], int n) {
		int cnt = 1;
		// int a=0;

		for (int start = 0; start < a.length / 2; start++) {
			a[start] = cnt + start;
			a[a.length - start - 1] = cnt + 1 + start;
			cnt++;

//		arr[start]=2*start+1;
//		for(int end=n-1;end>(n-1)/2;end--) {

//			arr[end]=2*(n-end);
//		}
		}
		if (n % 2 != 0) {

			a[(n / 2)] = n;
		}
	}

//	if (n==0) {}
//	else if(n>10000){
//		
//	}
//		
//	else {
//		for(int start=0;start<=(a.length-1)/2;start++) {
//	
//		a[start]=2*start+1;
//		for(int end=a.length-1;end>(a.length-1)/2;end--) {
//			
//			a[end]=2*(a.length-end);
//		}
//	}
//	for(int i=0;i<a.length;i++) {
//		System.out.print(a[i]+" ");
//	}
//}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int a[] = new int[n];
		arrangeNumber(a, n);
	}

}
