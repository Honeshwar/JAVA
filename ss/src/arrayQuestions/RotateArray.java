package arrayQuestions;

public class RotateArray {
	 public static void rotate(int[] arr, int d) {
	
	
		 
			// different approach ----1.
		 
//		    for (int i=0;i<arr.length;i++) {
//		    	if(arr[i]==d) {
////		    		int answer=i;
//		    		for(int j=0;i<=0;) {
//		    			int temp=arr[j];
//		    			int l=0;
//		    			while(l<arr.length-1) {
//	         			arr[l]=arr[l+1];
//		    			l++;
//		    			}arr[arr.length-1]=temp;
//		    		}
//		    	}
		  //  }
		 
		 // different approach ----2.
		 
//		 int a[]=new int[d];
//		 for (int i=0;i<d;i++) {
//			 a[i]=arr[i];
//		 }
//		 int j=0,k=0;
//		 while(j<arr.length) {
//			 if (j<arr.length-d) {
//				 
//				 arr[j]=arr[j+d];
//				 j++;
//			 }else {
//				 arr[j]=a[k];
//				 j++;k++;
//			 }
//			 
//		 }
		 
		 
			// different approach ----3.by reversing
		 int a[]=new int[d];
		 for (int i=0;i<d;i++) {
			 a[i]=arr[i];
		 }
		 int j=0,k=0;
		 while(j<arr.length) {
			 if (j<arr.length-d) {
				 
				 arr[j]=arr[j+d];
				 j++;
			 }else {
				 arr[j]=a[k];
				 j++;k++;
			 }
			 
		 }
	    }
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,4,8,9};
	int d=4;
	rotate(a, d);
	printArray(a);

	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
