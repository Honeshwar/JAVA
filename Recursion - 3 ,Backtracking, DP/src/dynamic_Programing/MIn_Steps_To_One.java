package dynamic_Programing;

public class MIn_Steps_To_One {

	
	public static int countMinSteos(int n) {
		if(n<=1)
			return 0;
		int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
//		int ans1=0,ans2=0,ans3=0; because min. find so we cannot take this.
		
		// entire step find for all possible , of this given way n-1.n/2,n/3.
		ans3=countMinSteos(n-1);
	   
		if(n%2==0) {
			ans1=countMinSteos(n/2);
		}
		else if(n%3==0) {
			ans2=countMinSteos(n/3);
		}
	
	
		return  Math.min(ans1, Math.min(ans2, ans3))+1;// +1 for nth element decrease kam)  ( n-1 , n/2 , n/3 take care by recursion).
		
	}
	// fine
	public static int count(int n) {
		if(n<=1)
			return 0;
		int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
		 ans1=count(n-1);//for 1 step
		 if(n%2==0)
		 ans2=count(n/2);//for n/2 step
		 else if(n%3==0)
		 ans3= count(n/3);//for n/3 step

		
		int output =Math.min(ans1, Math.min(ans2, ans3));// +1 induction step
		return output+1;
	//	return Math.min(ans1, Math.min(ans2, ans3))+1;
	}
	//some wrong
	public static int count2(int n) {
		if(n<=1)
			return 0;
	
		int ans1=count2(n-1);//for 1 step
		int  ans2=count2(n/2);//for n/2 step
		int  ans3= count2(n/3);//for n/3 step

		return Math.min(ans1, Math.min(ans2, ans3))+1;
		//return ans3;
	}

	public static void main(String[] args) {
		System.out.println(countMinSteos(10));
		System.out.println(count2(10));
		System.out.println(count(10));
		//System.out.println(4/3);
	}
}
