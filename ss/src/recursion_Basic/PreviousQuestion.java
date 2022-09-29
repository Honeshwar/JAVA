package recursion_Basic;

import java.util.Arrays;

public class PreviousQuestion {
	public static int maximumProfit(int budget[]) {
		return maximumProfit(budget, 0, budget.length);
	}
	public static int maximumProfit(int budget[],int start,int length) {
		Arrays.sort(budget);
			
		int small=maximumProfit(budget, start+1, length-1);
		if(start==budget.length-1) {
			return Math.max(0, budget[start]*length) ;
		}

		//System.out.print(small+" ");
		//length++;
		int result =Math.max(small, budget[start]*length);
		//System.out.println(result+"");
		
		return result;
	} 
	
	
	
	
	public static boolean splitArray(int a[]) { 
		
return	splitArray(a, 0, 0, 0);
	
	}

	 public static boolean splitArray(int b[],int start,int answer1,int answer2) {
if(start==b.length-1) {
	return answer1==answer2;
}
		 if(b[start]%5==0) {
			// answer1=answer1+;
			return splitArray(b, start+1, answer1+b[start], answer2);//++start than first value increase than goes to next function value;
			// start+1 pass changeable value in function,or  start(not start+1) value go in further line
			
		 }else if(b[start]%3==0) {
//			 answer2=answer2+3;
			return  splitArray(b, start+1, answer1, answer2+b[start]);
			
		 }else {
			 return splitArray(b, start+1, answer1+b[start], answer2)
					 ||splitArray(b,start+1, answer1, answer2+b[start]);
		 }
		 
	 }
	
	public static int zeros(int n){
		if(n==0) {
			return 1;
		}
		if(n<10) {
			return 0;
		}else if(n%10==0) {
			
			return 1+zeros(n/10);
		}
	//	if false
		return zeros(n/10);
	}
	
	
	public static boolean  palindrone(String s,int start,int end) {
		if(start==end)
			return true;
		if(start>end)
			return false;
		
		if(s.charAt(start)==s.charAt(end)){
			palindrone(s,++start,--end);
			return true;
		}else {
			return false;
		}
	
	}
	
	
	public static double  sumOfGP(int n,int start) {
		if(start==n) {
			return Math.pow(2, start);
		}
	double recusiveOutput=sumOfGP(n, ++start);
	double output=1+recusiveOutput+1/ Math.pow(2,start);
			return output;
	}
	
public static double  sumOfGP(int n) {
	if(n==0) {
		return 1;
	}
	double recusiveOutput=sumOfGP(n-1);
	double output =  (recusiveOutput+1/Math.pow(2,n));// I introduced  one value(part) that is last value
	// at last add after all recursion call
	return output;
	
}
	
public static void main(String[] args) {
	int n[]= {1,2,3,4};
	System.out.println(splitArray(n));
	//System.out.println(minCount(12));
	//System.out.println(convertStringToInt("1234"));
	//	System.out.println(zeros(303030303));
//System.out.println(sumOfGP(3));
////System.out.println(sumOfGP(3, 1));
//String s="racecar";
//System.out.println(palindrone(s, 0, s.length()-1));
	}


public static int minCount(int n) {
	if(n<4) {
		return n;
	}
	int result=n; //result=Integer.MAX_VALUE
	for(int i=1;i<=n;i++) {
		if(i*i>n)
			break;
	result =Math.min(result,1+minCount(n-i*i));}
	return result;
}




}
