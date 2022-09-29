package recursion_Basic;

import java.util.Arrays;

public class TestRevise {
	

public static void print2DArray(int a[][] ){
	int n=a.length;
	int start=0;
	while(start<n) {
	int i=0;
	while(i<n-start) {
		for(int j=0;j<a[start].length;j++) {
			System.out.print(a[start][j]+" ");
		}i++;
		System.out.println();
	}
	start++;
	}
}


public static void main(String[] args) {
	int n3[]= {30,20,53,14,50,50,14};
	System.out.println(maximumProfit(n3));
//		int n[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int n1[][]= {{12}};
////		print2DArray(n, 3, 3);
//		print2DArray(n);
	//System.out.println(find(2));
	
	
	int n=4;
	find(--n);// value change after decrement
	System.out.println(n);//n=3
	}
public static int find(int n) {
	if(n==0) {
		return 0;
	}int n1=n;
	int small=find(--n);
	return small+n1;
}
	
public static int maximumProfit(int budget[]) {
	return maximumProfit(budget, 0, budget.length);
}
public static int maximumProfit(int budget[],int start,int length) {
	Arrays.sort(budget);
	int s1=start,l1=length;
	if(start==budget.length-1) {
		return Math.max(0, budget[s1]*l1) ;
	}

	int small=maximumProfit(budget, ++start, --length);
	//System.out.print(small+" ");
	//length++;
	int result =Math.max(small, budget[s1]*l1);
	//System.out.println(result+"");
	
	return result;
}
	
	
	
	
}
