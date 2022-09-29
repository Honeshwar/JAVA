package arrayQuestions;

public class SecondLargestInArray {
	 public static int secondLargestElement(int[] arr) {
		 int n=arr.length;
		 int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
		 
		 int i=0;
		 while(i<n) {
			 if (arr[i]>largest) {
				 int temp=largest;
				 largest=arr[i];
				 secondLargest=temp;
				// i++;
			 }
			 else if(arr[i]>secondLargest) {
				 if(arr[i]==largest) {
					// i++;
					 }
				 else {
					 secondLargest=arr[i];
					// i++;
				 }
			 }//else {
			// i++;
				 
				 i++;}
		 
		
	    	return secondLargest;
	    }
	public static void main(String[] args) {
		int a[]= {1,9,2,8,9,7};
		
	System.out.print(secondLargestElement(a));
	//	printArray(a);

		}
		public static void printArray(int []a) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}

}
