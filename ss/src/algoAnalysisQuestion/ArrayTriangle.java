package algoAnalysisQuestion;

public class ArrayTriangle {

	public static void main(String[] args) {
		int n=4;
		int a[][]=new int[n][2*n-1];
		
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j<2*i+1;j--) {
	if(j>n-i-1) {
		System.out.print(" ");
	}else if(j>=n-i-1&&j<n) {
		System.out.print("*");}
	else if(j<=n) {
			int k=i-1;
		while(k-->=0) {
			System.out.print("*");
		}
	}else {
		System.out.print(" ");
	}

}
			System.out.println();
}
	}

}
