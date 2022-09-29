package recursion_3;

public class MinimumInArray_RECUSIVE {

	public static void minElementInArray(int a[],int startIndex,int answerSoFar) {
		if(startIndex==a.length-1) {
			System.out.println(answerSoFar);
			return;// call return after hit base case
		}
		
		if(a[startIndex]<answerSoFar){// actual output carry answerSoFar(initial pass as +infinity)
			answerSoFar=a[startIndex];
		}
		minElementInArray(a, startIndex+1, answerSoFar);
	}
	
	public static void main(String[] args) {
		int a[]= {2,3,5,6,7,1,0,1};
		System.out.println(minElementInArrayHelper(a, 0));
		minElementInArray(a, 0, Integer.MAX_VALUE);
	}
	
	// func create hoga that print minimum
	public static int minElementInArrayHelper(int a[],int startIndex) {
		if(startIndex==a.length)
			return Integer.MAX_VALUE;
		
		int smallOutput=minElementInArrayHelper(a, startIndex+1);
		
			if(a[startIndex]<smallOutput)
				return a[startIndex];
			
			
			return smallOutput;
	}

	public static void minElementInArray(int a[]) {
		
		 System.out.println(minElementInArrayHelper(a, 0));
		
	}
}
