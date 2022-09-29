package dynamic_Programing;

import recursion_3.Keypad_SequenceInCellPhoneNumberDigit.solution;

public class Optimize_Fibnocci_Number_Using_DP {

	//T(n)=O(2^n)
	public static int fib(int n) {
		if(n==0||n==1)
			return n;
		
		// if in want to find nth fib no. so i have know about (n-1)th and (n-2)th fib no.
		int ans1=fib(n-1);
		int ans2=fib(n-2);// not -ve .
		
		int myAns=ans1+ans2;
		return myAns;
		
	}
	
	/* 
	 * Optimize_Fibnocci_Number_Using_DP
	 * T(n)=O(n)
	 * 
	*/
	public static int fib(int n,int dp[]) {// array store repeated subproblem output. we can also use hashmap.
		if(n==0||n==1)
			return n;
		
		// if in want to find nth fib no. so i have know about (n-1)th and (n-2)th fib no.
		int ans1, ans2;
		if(dp[n-1]==-1){// initial -1 all element in array
		   ans1=fib(n-1);
		   dp[n-1]=ans1;
		}else {// we alrady fint that value
			ans1=dp[n-1];
		}
		if(dp[n-2]==-1){// initial -1 all element in array
			ans2=fib(n-2);// not -ve . n=1 == -ve but base alread handle it
			   dp[n-2]=ans2;
			}else {// we alrady find that value || we alrady have that value
				ans2=dp[n-2];
			}

		
		int myAns=ans1+ans2;
		//dp[n]=myAns;
		return myAns;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(fib(5));
		
		int SubProblemstorage[]=new int [5+1];//n+1,   fib terms = 0th ,1th,2th..
		for(int i=0;i<6;i++) {
		SubProblemstorage[i]=-1;
		}
		System.out.println(fib(5, SubProblemstorage));
		for(int i=0;i<6;i++) {
			System.out.print(SubProblemstorage[i]+" ");
			}
	}
	
}
