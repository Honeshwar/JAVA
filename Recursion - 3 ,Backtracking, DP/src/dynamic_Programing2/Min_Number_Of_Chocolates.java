package dynamic_Programing2;

public class Min_Number_Of_Chocolates {

public static int getMin(int arr[], int N){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
	
	int dp[]=new int [N];
	
	// distribution from start of line to end.
	dp[0]=1; // first min=1 ,no comparison of marks
	int ans1=1;
	for(int i=1;i<N;i++) {
		
		if(arr[i]>arr[i-1]) { //student mark more that previous.
			dp[i]=1+dp[i-1];  // +1 chocolate milagi than prevoius.
			ans1+=dp[i];
		}
		else {
			dp[i]=1;////student mark less than or equals to  that of previous student only one chocolate.
		    ans1+=dp[i];
		}
	}
	for(int i=0;i<N;i++) {
		System.out.print(dp[i]+" ");
	}
	System.out.println();
	//// distribution from end of line to start of line.
	
	
	
     	dp[N-1]=dp[N-1];//same default max , min
	    int ans2=dp[N-1];;
		for(int i=N-2;i>=0;i--) {
				
				if(arr[i]>arr[i+1]) { //student mark more that previous.
					
					if(dp[i]<=dp[i+1]) {//check if in above distribution if she gave less to ith we increace it by one mor chocolate than i+1
					dp[i]=1+dp[i+1];  // +1 chocolate milagi than prevoius.
					ans2+=dp[i];
					}
					else {
						dp[i]=dp[i];
					    ans2+=dp[i];
					}
					
				}
				
				else {
					//dp[i]=1;////student mark less than or equals to  that of previous student only one chocolate.
				    ans2+=dp[i];
	}
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		System.out.println(ans1+" "+ans2);
		
		return Math.min(ans1, ans2);
		//return ans2;
	    // max marks student may get only one choclate while start to end but teacher wantsto give max choclate to him.
	    // so when teacher give chocolate from End to start so max mark student will get max chocolates that why
	    // we return sum if chocolate in dp after calculationg from both side.
	                    
    }

public static void main(String[] args) {
	int a[]= {82440 ,36222 ,39726 ,90098, 21130,
			95534, 90800 ,97143 ,56966 ,45758, 27836 ,
			30506 ,59211 ,72381 ,5674, 45858, 85108,
			10284, 93404, 66620 };
	System.out.println(getMin(a,a.length ));
}















}
