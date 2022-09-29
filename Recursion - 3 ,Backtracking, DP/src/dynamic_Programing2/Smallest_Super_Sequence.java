package dynamic_Programing2;

public class Smallest_Super_Sequence {

	
	public static int smallestSuperSequenceHelper(String str1, String str2,int i,int j) {//traverse
        if(i==str1.length() )
        	return str2.substring(j).length(); // bacha hua ko add complete so combine susequence formed
        if(j==str1.length() )
        	return str1.substring(i).length(); // bacha hua ko add complete so combine susequence formed
		
		// adfg , jkl output= adfgjkl = 7 not find common find smallest super ( combine of both string ) subsequence.

        int output=0;
		if(str1.charAt(i)==str2.charAt(j))
		output=1+smallestSuperSequenceHelper(str1, str2, i+1, j+1);
		
		
		else {
			
			int ans1=smallestSuperSequenceHelper(str1, str2, i, j+1); // str1.charAt(i) included,str2.charAt(i) exclude
			int ans2=smallestSuperSequenceHelper(str1, str2, i+1, j); // str1.charAt(i) exclude,str2.charAt(i) included
			
			output=1+Math.min(ans1, ans2);
			// +1 for element that are not included in and min in both call.
			// because we have to find combine subsequence not commmon.
			// abc,av  output= abcv = 4 in length.
			// vfc,abc  output= vfcab = 5 in length.
			
			
		}
		return output;
		
		
		
	
		
	}
	
	//iterative
	/*
	
	    Time Complexity: O(n*m)
	
	    Space Complexity: O(n*m)
	
	    where n and m are lengths of input strings
	
	*/
	public static int smallestSuperSequenceHelper(String str1, String str2) {
		
		int s1=str1.length();
		int s2=str2.length();
		int dp[][]=new int [s1+1][s2+1];
		
		
		
		for(int i=s1;i>=0;i--) {
			for(int j=s2;j>=0;j--) {
				
				//base case
				 if(i==s1 ) {
			        	dp[i][j] = str2.substring(j).length(); // bacha hua ko add complete so combine susequence formed
			           continue;
				 }
			        	if(j==s2 ) {
			        	dp[i][j] = str1.substring(i).length(); // bacha hua ko add complete so combine susequence formed
			        	continue;
			 }
			        
			        
			        
			        if(str1.charAt(i) == str2.charAt(j))
			        	dp[i][j]=1+dp[i+1][j+1];
			        
			        else {
			        	dp[i][j]=1+Math.min(dp[i][j+1], dp[i+1][j]);
			        }
			        	
			}
			
		}
		
		
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		System.out.println(smallestSuperSequenceHelper("pqqrpt", "qerepct", 0, 0));
		System.out.println(smallestSuperSequenceHelper("pqqrpt", "qerepct"));
	}
}
