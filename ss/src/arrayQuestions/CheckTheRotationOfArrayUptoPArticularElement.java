package arrayQuestions;

public class CheckTheRotationOfArrayUptoPArticularElement {
	 public static int arrayRotateCheck(int[] arr){
		 int count=0,n=arr.length, answer=0;
		 for(int i=0;i<=n-2;i++) {
			 if (arr[i]<arr[i+1]) {
				 count++;
			 }else {
				 return i+1;
			 }
		 }
//		 if(count==n-1) {
//		 answer=0;
//		 }
		 
	    	return answer;
	    }

	public static void main(String[] args) {
		int a[]= {10, 20, 30, 1};
				
				//10, 20, 30, 1};
		int k=arrayRotateCheck(a);
System.out.println(k);
	}

}
