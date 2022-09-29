package dynamic_Programing2;

public class LEAST_COMMON_SUBSEQUENCE {

	//recusive
	public static int lcs(String str1,String str2,int i,int j) {// i=str1 start index ,  j=str2 start index
		
		// base case
		if(i==str1.length() || j==str2.length())
			// str1  d b c
            // str2  a d b
			//index  0 1 2
			return 0;
		
		if(str1.charAt(i)==str2.charAt(j)) {// str1 a bc
			                                // str2 a db
			  return 1+lcs(str1, str2, i+1, j+1); 
			  // +1 for find one SUBSEQUENCE (i do part) and its length =1  , other find by recursion  and its length return by recursion                     
		}
		else {//str1.charAt(i)!=str2.charAt(j)
			// str1  d b c
            // str2  a d b
			//index  0 1 2
			//i=0,j=0
			//both string possible subsquence find out karunga
			
			int ans1=lcs(str1, str2, i, j+1);//str1 include ,str2 exclude
			int ans2=lcs(str1, str2, i+1, j);//str2 include ,str1 exclude
			
			// both recursion give me its largest subsequence length.
			// max find
			int myANs=Math.max(ans1, ans2);//max length
			
			return myANs;
			
		
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
	//memoization
	// T(N)=O(M*N) = NO. OF ELEMENT IN MATRIX MxN.
	public static int lcs(String str1,String str2,int i,int j,int dp[][]) {
		
		//base case
		if(i==str1.length() || j==str2.length())
			return 0; // "" empty string(subsequence) length=0
		int myAns=0;
		//i=0 character and j=0   character equals.
		if(str1.charAt(i)==str2.charAt(j)) {
			int smallOutput=0;//
			if(dp[i+1][j+1]==-1) {
			 smallOutput=lcs(str1, str2, i+1, j+1,dp);
			 dp[i+1][j+1]=smallOutput;
			}else {
				smallOutput= dp[i+1][j+1];
			}
			myAns=1+smallOutput;
		}
		
		else {
			int ans1=0;
			int ans2=0;
			
			//str1 include str2 exclude, find include in entire str2 by excluding character of str2 one by one.
			if(dp[i][j+1]==-1) {
				ans1=lcs(str1, str2, i, j+1, dp);
				dp[i][j+1]=ans1;
			}else {
				ans1=dp[i][j+1];
			}
			
			
			//str2 include str1 exclude, find include in entire str1 by excluding character of str1 one by one.
			
			if(dp[i+1][j]==-1) {
				ans2=lcs(str1, str2, i+1, j, dp);
				dp[i+1][j]=ans2;
			}else {
				ans2=dp[i+1][j];
			}
			
			
			
			myAns=Math.max(ans1, ans2);
		}
		
		
		
		return myAns;
		
		
		
	}

	
	//iterative
	public static int lcs(String str1,String str2) {
		// good thing to main variable for function.
		int m=str1.length();
		int n=str2.length();
		
		int dp[][]=new int [m+1][n+1];// +1 for recusive condition obey [i+1] index out of bound n aaya	.
		//due to base case=0
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp.length;j++) {
				dp[i][j]=0;//Integer.MAX_VALUE
			}
		}
		
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {// last cell enter except extra added cell,
	
				if(str1.charAt(i)==str2.charAt(j)) {
//					if(i==m-1&&j==n-1) {
//					dp[i][j]=1;
//					continue;}
					
//					int ans1=dp[i][j+1];
//					int ans2=dp[i+1][j];
//					
					dp[i][j]= 1+dp[i+1][j+1];// ome subquence already we have. 
				
					continue;
				}
//				else
//					dp[i][j]=0;//already
				

				int ans1=dp[i][j+1];
				int ans2=dp[i+1][j];
				
				dp[i][j]=Math.max(ans1, ans2);
			
			}
		}
		return dp[0][0];
		
		
	}
	
	public static void main(String[] args) {
		String s1="abdgec";
		String s2="bfdmgjc";
		int dp[][]=new int [s1.length()+1][s2.length()+1];// +1 for cheecking empty element also,i+1 also.
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp.length;j++) {
				dp[i][j]=-1;//Integer.MAX_VALUE
			}
		}
		System.out.println(lcs("abdgec", "bfdmgjc", 0, 0));
		System.out.println(lcs("abdgec", "bfdmgjc", 0, 0,dp));
		System.out.println(lcs(s1, s2));
	}
	
}
