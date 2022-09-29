package dynamic_Programing;

public class Min_Square_Needed_To_Represent_N {
	
	// recusive
public static int minSquare(int n) {
	// special case
	if(n==0)
		return 0;
	
	//  i wanted to explore all possible path (1^2=2,2^2=4,....square upto n)
	int min=Integer.MAX_VALUE;
	for(int i=1;i*i<=n;i++) {
		int smallOutput=minSquare(n-i*i);
		min=Math.min(smallOutput, min);
		
	}
	return min+1;
}

	
//R.D.P or MEMOIZATION
// T(N)=O(N* underroot of N) = NO. OF ELEMENT IN MATRIX MxN

	public static int minSquare2(int n) {
		return minSquare2(n, new int [n+1]);//index=no.
	}
public static int minSquare2(int n,int dp[]) {
		if(n==0)
			return 0;
		int min=Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int smallOutput=Integer.MAX_VALUE;
			if(dp[n-i*i]==0){// 0==no min inital all == 0
			smallOutput=minSquare2(n-i*i, dp);
			dp[n-i*i]=smallOutput;
			}else {
				smallOutput=dp[n-i*i];
			}
			
			min=Math.min(smallOutput, min);
//			dp[i]=min;// 
		}
		return min+1;
	}
	


// I.D.P
    public static int minCount(int n) {

        int minSquaresRequired[] = new int[n + 1];

       
			minSquaresRequired[0] = 0;
//			minSquaresRequired[1] = 1;

for (int i = 1; i <= n; ++i) {
    //minSquaresRequired[i] = Integer.MAX_VALUE;
	int min=Integer.MAX_VALUE;
    for (int j = 1; i - (j * j) >= 0; ++j) {
//        minSquaresRequired[i] = Math.min(minSquaresRequired[i], minSquaresRequired[i - (j * j)]);
    	min=Math.min(min, minSquaresRequired[i - (j * j)]);
    }
    		minSquaresRequired[i]=min+1;
//          minSquaresRequired[i] += 1;
}

return minSquaresRequired[n];
}


	
	
	
	
	
public static void main(String[] args) {
	System.out.println(minSquare2(3));
}
}
