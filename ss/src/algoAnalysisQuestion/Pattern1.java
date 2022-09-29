package algoAnalysisQuestion;

public class Pattern1 {
public static void patt(int n) {
	System.out.println(" *");
	for(int i=1;i<=2*n-1;i++) {
		System.out.print("*");
		if(i<=n) {
			//increase in horizontal
			int j=1;
			for(;j<=i;j++) {
				System.out.print(j);
			}
			// decrease in horizontal
			int k=j-2;
			while(k>=1) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
		}
		// lower half(vertical) with increasing i
		else {
			//increase in horizontal
			int j=1;
			while(j<=(2*n-1)-i+1) {// formula to print i>n 
				System.out.print(j);
				j++;
			}
			
			// decrease in horizontal
			int k=j-2;
			while(k>=1) {
				System.out.print(k);
				k--;
			}
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println(" *");
	
}
	public static void main(String[] args) {
		int n=3;
		patt(n);

	}

}
